package com.zju.edu.integration.clever.model;

import java.util.Date;

public class MedcationOrderStatus {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String medcationOrderID;//药嘱ID
	public String medication;//药物名称
	public String curStatus;//标准状态
	public String careflowStatus;//实际状态
	public Date performDateTime;//执行时间
	public String performDoctorCode;//执行人员代码
	public String performDoctorName;//执行人员名称

}
