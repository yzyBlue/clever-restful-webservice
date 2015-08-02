package com.zju.edu.integration.clever.model;

import java.util.Date;

public class PatientDiachargeInfo {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public int orderID;//医嘱ID
	public Date dateOfCharge;//离院日期时间
	public String disChargeWard;//出院病区
	public String dischargeDept;//离院科室
	public String dischargeDestinationType;//离院目的地类型
	public String dischargeDestination;//离院目的地
	public String dischargeMethod;//离院方式
	public String dischargeDescripition;//离院概述
	

}
