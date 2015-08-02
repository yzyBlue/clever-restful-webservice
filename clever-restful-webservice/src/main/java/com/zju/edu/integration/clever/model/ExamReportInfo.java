package com.zju.edu.integration.clever.model;

import java.util.Date;

public class ExamReportInfo {
	public String patentID;//病人号(*)
	public String visitID;//就诊号(*)
	public String examReqID;//检查申请号
	public String examID;//检查号
	public int reportID;//报告序号(*)
	public Date reportDate;//报告日期
	public String reporterID;//报告人编号
	public String reporterName;//报告人姓名
	public String reviewerID;//审核人编号
	public String reviewerName;//审核人姓名
	public String resultValue;//检查定量结果
	public String findings;//检查所见
	public String conclusion;//检查结论
	public String memo;//检查报告备注
	public String description;//检查描述
	public String reportAbsolutePath;//报告存储绝对路径
	public String reportRelatviePath;//报告存储相对路径
	public String hyperplasiaDegree;//增生程度
	public String myeloidErythroidRatio;//粒红比
	public String marrowBlasts;//原幼细胞

}
