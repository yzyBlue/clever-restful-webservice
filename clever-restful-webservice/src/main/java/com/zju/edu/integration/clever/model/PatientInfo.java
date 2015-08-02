package com.zju.edu.integration.clever.model;

import java.util.Date;

public class PatientInfo {
	public String patientID;//病人号（*）
	public String patientName;//病人姓名（*）
	public String patientSex;//病人性别，M：男、F:女、U：未知、O：未说明(*)
	public Date dateOfBirth;//出生日期
	public String nationality;//国籍
	public String ethnic;//民族
	public String maritalStatus;//婚姻状况
	public String profession;//职业
	public String educationBackground;//文化程度
	public String bloodTypeABO;//ABO血型
    public String bloodTypeRH;//RH血型
    public String patientIdNO;//居民身份证号码
    public String healthNO;//居民健康卡号码
    public String birthPlace;//出生详细地址
    public String birthPlaceCountry;//出生地址-国
    public String birthPlaceProvince;//出生地址-省
    public String birthPlaceCity;//出生地址-市）镇
    public Date dateOfDeath;//患者死亡时间
    public String deathCountry;//死亡地址-国
    public String deathProvince;//死亡地址-省
    public String deathCity;//死亡地址-市
	

}
