package com.zju.edu.integration.clever.model;

import java.util.Date;

public class DrugDispenseReqStatus {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String drugDispensingReqID;//摆药申请单号
	public String medicationName;//药物名称
	public String performSerialNumber;//执行单序号
	public String curStatus;//标准状态
	public String careflowStatus;//实际状态
	public Date performDateTime;//执行时间
	public String performDeptCode;//执行科室代码
	public String performDeptName;//执行科室名称
	public String performDoctorCode;//执行人员代码
	public String performDoctorName;//执行人员名称
}
