package com.zju.edu.integration.clever.model;

import java.util.Date;

public class OrderInfo {
	public int orderID;//医嘱ID,(*)
	public String patientID;//病人ID,(*)
	public String visitID;//就诊ID,(*);
	public int orderNO;//医嘱序号,(*)
	public int orderSubNO;//医嘱子序号(*)
	public int emergency;//紧急医嘱属性,0-普通，1-紧急，默认为0
	public int motherOrBaby;//母婴属性,0-母亲，从1开始表示第几个婴儿
	public int reservedOrder;//备用医嘱属性,0-正常医嘱，1-备用医嘱
	public int subsequentOrder;//补录医嘱属性,0-正常医嘱，1-后来补录的医嘱
	public int repeatOrder;//是否长期医嘱,1-长期，0-临时索引(*)
	public String orderClass;//医嘱类别
	public String orderContent;//医嘱内容
	public String orderCode;//医嘱代码
	public Date startDateTime;//医嘱计划开始日期
	public Date stopDateTime;//医嘱计划停止日期
	public int duration;//医嘱持续时间
	public String frequencyContent;//执行频率描述
	public String frequencyNumber;//频率次数
	public String frequencyInterval;//频率间隔 
	public String frequencyIntervalUnit;//频率间隔单位
	public String memo;//备注
	public Date startOrderInputDate;//开医嘱录入日期时间
	public Date stopOrderInputDate;//停医嘱录入日期时间
	public String semantics;//医嘱语义

}
