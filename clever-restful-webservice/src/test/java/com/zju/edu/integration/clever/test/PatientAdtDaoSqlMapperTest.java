package com.zju.edu.integration.clever.test;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.zju.edu.integration.clever.dao.PatientAdtDao;
import com.zju.edu.integration.clever.entity.SQLSessionConfig;
import com.zju.edu.integration.clever.model.PatientAdmission;
import com.zju.edu.integration.clever.model.PatientInfo;

public class PatientAdtDaoSqlMapperTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	//private ClassPathXmlApplicationContext context;
	@Before
	public void init(){
		//context=new ClassPathXmlApplicationContext("com/zju/edu/integration/clever/config/SQLMapperConfig.xml");
	}
	@Test
	public void testPatientAdtDao(){
		logger.debug("*********  testPatientAdtDao Start ***********");
		SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDao=sqlSession.getMapper(PatientAdtDao.class);
		logger.debug("*********  patientAdtDaoNew Created  ***********");
		try{
			PatientInfo patientInfo=new PatientInfo();
			patientInfo.setBirthPlace("中国浙江杭州");
			patientInfo.setBirthPlaceCity("杭州");
			patientInfo.setBirthPlaceCityCode("3310");
			patientInfo.setBirthPlaceCountry("中国");
			patientInfo.setBirthPlaceCountryCode("1");
			patientInfo.setBirthPlaceProvince("浙江");
			patientInfo.setBirthPlaceProvinceCode("3");
			patientInfo.setBloodTypeABO("AB");
			patientInfo.setBloodTypeRH("RH-");
			patientInfo.setDateOfBirth(new Date());
			patientInfo.setDateOfDeath(new Date());
			patientInfo.setEducationBackground("大学");
			patientInfo.setEthnic("汉族");
			patientInfo.setEthnicCode("01");
			patientInfo.setHealthNO("98786465");
			patientInfo.setMaritalStatus("已婚");
			patientInfo.setMaritalStatusCode("02");
			patientInfo.setNationality("中国");
			patientInfo.setPatientID("M0000003");
			patientInfo.setPatientIdNO("42058231657321354");
			patientInfo.setPatientName("陈佩佩");
			patientInfo.setPatientSexCode("02");
			patientInfo.setPatientSexName("女");
			patientInfo.setProfession("学生");
			logger.debug("*********  patientInfo Created  ***********");
			logger.debug(patientInfo.toString());
			long i=patientAdtDao.insertPatientInfo(patientInfo);
			logger.debug("*********  patientInfo Inserted  ***********");
						
			PatientAdmission patientAdm=new PatientAdmission();
			Date date=new Date();
			String id="1234";
			String str="test";
			patientAdm.setAdmissionType(str);
			patientAdm.setAdmissionTypeCode(id);
			patientAdm.setAdmitDateTime(new Date());
			patientAdm.setAdmitDoctorID(id);
			patientAdm.setAdmitDoctorName(str);
			patientAdm.setAdmitIntent(str);
			patientAdm.setAdmitSource(str);
			patientAdm.setAttendingDoctorID(id);
			patientAdm.setAttendingDoctorName(str);
			patientAdm.setBedCode(id);
			patientAdm.setBedName(str);
			patientAdm.setBusinessPhone("15468256837");
			patientAdm.setDeptCode(id);
			patientAdm.setDeptName(str);
			patientAdm.setDeputyDoctorID(id);
			patientAdm.setDeputyDoctorName(str);
			patientAdm.setDirecotrID(id);
			patientAdm.setDirecotrName(str);
			patientAdm.setDoctorGroupID(id);
			patientAdm.setPatientClassCode("I");
			patientAdm.setPatientClassName("住院");
			patientAdm.setPatientID("M0000003");
			patientAdm.setVisitID("45354564");
			logger.debug("*********  patientAdmission Created  ***********");
			logger.debug(patientAdm.toString());
			long j=patientAdtDao.insertPatientAdmission(patientAdm);
			logger.debug("*********  patientAdmission Inserted  ***********");
			sqlSession.commit();
			logger.debug("*********  SqlSession Commit  ***********");
		}catch(Exception e){
			logger.error(e.toString());
			sqlSession.rollback();
			logger.debug("*********  SqlSession Rollback  ***********");
		}finally{
			sqlSession.close();
			logger.debug("*********  SqlSession Closed  ***********");
		}
		logger.debug("*********  testPatientAdtDao End ***********");
	}
}
