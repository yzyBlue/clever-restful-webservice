package com.zju.edu.integration.clever.model;

import java.util.Date;

public class Therapy {
	public String patientID;//病人号(*)
	public String visitID;//就诊号(*)
	public String orderID;//医嘱ID
	public String therapyID;//治疗申请号(*)
	public String therapyContent;//治疗内容
	public Date planneExecDatetime;//计划执行时间
	public Date plannedStopDatetime;//计划停止时间
	public String dosage;//剂量
	public String dosageUnit;//剂量单位
	public String administrationCode;//给药途径代码
	public String administrationName;//给药途径名称
	public String frequencyDescription;//频率描述
	public int frequencyCount;//频率次数
	public int frequencyInterval;//频率间隔
	public String frequencyIntervalUnit;//频率间隔单位
	public String memo;//备注

}
