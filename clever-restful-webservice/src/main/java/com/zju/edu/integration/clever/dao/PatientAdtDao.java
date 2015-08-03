package com.zju.edu.integration.clever.dao;

import org.springframework.stereotype.Repository;

import com.zju.edu.integration.clever.model.PatientAdmission;
import com.zju.edu.integration.clever.model.PatientInfo;
@Repository("patientAdtDao")
public interface PatientAdtDao {
	
	public long insertPatientInfo(PatientInfo patientInfo);
	
	public long insertPatientAdmission(PatientAdmission patientAdmission);

}
