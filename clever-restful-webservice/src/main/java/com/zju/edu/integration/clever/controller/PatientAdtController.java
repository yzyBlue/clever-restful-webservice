package com.zju.edu.integration.clever.controller;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zju.edu.integration.clever.dao.PatientAdtDao;
import com.zju.edu.integration.clever.entity.PatientAdmissionEntity;
import com.zju.edu.integration.clever.model.IntegrationResult;
import com.zju.edu.integration.clever.model.PatientAdmission;
import com.zju.edu.integration.clever.model.PatientInfo;

@Controller
@RequestMapping("/PatientAdt")
public class PatientAdtController {
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	@RequestMapping(value = "/PatientAdmission", method = RequestMethod.POST, produces = "application/xml;charset=UTF-8")
	public @ResponseBody IntegrationResult patientAdmissionInfoExtract(PatientAdmissionEntity patientAdmissionEntity){
		IntegrationResult integrationResult= new IntegrationResult();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			PatientAdtDao patientAdtDao=sqlSession.getMapper(PatientAdtDao.class);
			PatientInfo patientInfo=patientAdmissionEntity.getPatientInfo();
			long guid=patientAdtDao.insertPatientInfo(patientInfo);
			PatientAdmission patientAdmission=patientAdmissionEntity.getPatientAdmission();
			long uid=patientAdtDao.insertPatientAdmission(patientAdmission);
			integrationResult.setResultCode(integrationResult.SUCCESSCODE);
			integrationResult.setResultDesc(integrationResult.SUCCESSDESC);
			sqlSession.commit();
		}catch(Exception e){
			logger.error(e.toString());
			integrationResult.setResultCode(integrationResult.INTERNALERROR);
			integrationResult.setResultDesc(integrationResult.INTERNALDESC);
			sqlSession.rollback();
		}finally{
			sqlSession.close();
		}
		return integrationResult;
		
		
	}
	

}
