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

public class PatientAdtDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	private ClassPathXmlApplicationContext context;
	@Resource (name="patientAdtDao")
	private PatientAdtDao patientAdtDao;
	//private SqlSessionFactory sqlSessionFactory;
	//@Resource 
	private PlatformTransactionManager platformTransactionManager;
	@Before
	public void init(){
		context=new ClassPathXmlApplicationContext("com/zju/edu/integration/clever/config/spring-mybatis.xml");
		patientAdtDao=(PatientAdtDao) context.getBean("patientAdtDao");
		platformTransactionManager=(PlatformTransactionManager) context.getBean("transactionManager");
		//sqlSessionFactory=(SqlSessionFactory) context.getBean("sqlSessionFactory");
	}
	@Test
	public void testPatientAdtDao(){
		logger.debug("*********  testPatientAdtDao Start ***********");
		//SqlSession sqlSession=SQLSessionConfig.getSqlSessionFactory().openSession();
		//SqlSession sqlSession=sqlSessionFactory.openSession();
		//logger.debug("*********  SqlSession Open  ***********");
		//PatientAdtDao patientAdtDaoNew=patientAdtDao;
		//PatientAdtDao patientAdtDaoNew=sqlSession.getMapper(PatientAdtDao.class);
		//logger.debug("*********  patientAdtDaoNew Created  ***********");
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setName("Patient-Admission-Transaction");
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status=platformTransactionManager.getTransaction(def);
		try{
			PatientInfo patientInfo=new PatientInfo();
			//UUID uuid  =  UUID.randomUUID(); 
			//patientInfo.setGuid(uuid.toString());
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
			patientInfo.setPatientID("M0000005");
			patientInfo.setPatientIdNO("42058231657321354");
			patientInfo.setPatientName("紫熏");
			patientInfo.setPatientSexCode("02");
			patientInfo.setPatientSexName("女");
			patientInfo.setProfession("上仙");
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
			patientAdm.setBusinessPhone("1232456789");
			patientAdm.setDeptCode(id);
			patientAdm.setDeptName(str);
			patientAdm.setDeputyDoctorID(id);
			patientAdm.setDeputyDoctorName(str);
			patientAdm.setDirecotrID(id);
			patientAdm.setDirecotrName(str);
			patientAdm.setDoctorGroupID(id);
			patientAdm.setPatientClassCode("I");
			patientAdm.setPatientClassName("住院");
			patientAdm.setPatientID("M0000005");
			patientAdm.setVisitID("546513");
			logger.debug("*********  patientAdmission Created  ***********");
			logger.debug(patientAdm.toString());
			long j=patientAdtDao.insertPatientAdmission(patientAdm);
			logger.debug("*********  patientAdmission Inserted  ***********");
			//sqlSession.commit();
			//logger.debug("*********  SqlSession Commit  ***********");
		}catch(Exception e){
			logger.error(e.toString());
			//sqlSession.rollback();
			//logger.debug("*********  SqlSession Rollback  ***********");
			platformTransactionManager.rollback(status);
			logger.debug("*********  platformTransactionManager Rollback  ***********");
			//e.printStackTrace();
		}finally{
			//sqlSession.close();
			//logger.debug("*********  SqlSession Closed  ***********");
			platformTransactionManager.commit(status);
			logger.debug("*********  platformTransactionManager commit  ***********");
		}
		logger.debug("*********  testPatientAdtDao End ***********");
	}
}
