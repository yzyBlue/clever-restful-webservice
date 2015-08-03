package com.zju.edu.integration.clever.model;

import java.util.Date;

public class OrderStatusInfo {
	 
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱申请号
	public String orderItem;//医嘱内容
	public String curStateCode;//标准状态代码
	public String curStateName;//标准状态
	public String careflowStepCode;//实际状态代码
	public String careflowStepName;//实际状态
	public Date performDateTime;//执行时间
	public String performDeptCode;//执行科室代码
	public String performDeptName;//执行科室名称
	public String performDoctorCode;//执行人员代码
	public String performDoctorName;//执行人员名称
	public String personTypeCode;//人员种类,0-医生 1-护士
	public String personTypeName;//人员种类,0-医生 1-护士
	public String memo;//备注	

}
