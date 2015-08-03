package com.zju.edu.integration.clever.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zju.edu.integration.clever.dao.PatientAdtDao;

public class PatientAdtDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	private ClassPathXmlApplicationContext context;
	private PatientAdtDao patientAdtDao;
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void init(){
		context=new ClassPathXmlApplicationContext("com/zju/edu/integration/clever/config/spring-mybatis.xml");
		patientAdtDao=(PatientAdtDao) context.getBean("patientAdtDao");
		sqlSessionFactory=(SqlSessionFactory) context.getBean("sqlSessionFactory");
	}
	@Test
	public void testPatientAdtDao(){
		logger.debug("*********  testPatientAdtDao Start ***********");
		SqlSession sqlSession=sqlSessionFactory.openSession();
		logger.debug("*********  SqlSession Open  ***********");
		PatientAdtDao patientAdtDaoNew=sqlSession.getMapper(PatientAdtDao.class);
		logger.debug("*********  patientAdtDaoNew Created  ***********");
		sqlSession.commit();
		logger.debug("*********  SqlSession Commit  ***********");
		sqlSession.close();
		logger.debug("*********  SqlSession Closed  ***********");
		logger.debug("*********  testPatientAdtDao End ***********");
	}
}
