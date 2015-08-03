package com.zju.edu.integration.clever.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="PatientAdmission")
public class PatientAdmission {
	public long uid;
	public String patientID;//病人号(*)
	public String patientClass;//病人类型,I代表住院，O代表门诊，E代表急诊，P代表体检(*)
	public String visitID;//就诊号(*)
	public String deptCode;//科室代码
	public String deptName;//科室名称
	public String wardCode;//病区编号,即护理站编号
	public String wardName;//病区名称,即护理站名称
	public String roomCode;//病房号
	public String roomName;//病房名称
	public String bedCode;//病床号
	public String bedName;//病床名称
	public Date  admitDateTime;//就诊时间(*)
    public String admitIntent;//就诊目的
    public String admitDoctorID;//门诊的接诊医生编码
    public String admitDoctorName;//门诊的接诊医生姓名
    public String residentDoctorID;//住院医师编码
    public String residentDoctorName;//住院医师姓名
    public String attendingDoctorID;//主治医师编码
    public String attendingDoctorName;//主治医师姓名
    public String direcotrID;//主任医师编码
    public String direcotrName;//主任医师姓名
    public String deputyDoctorID;//副主任医师编码
    public String deputyDoctorName;//副主任医师姓名
    public String admitSource;//入院来源
    public String patientCondition;//入院病情
    public String admissionType;//入院途径
    public String financialClass;//费别
    public String nursingClass;//护理等级
    public String doctorGroupID;//医生组ID
    public String nursingGroupID;//护理组ID
    public String firstAdmissionIndicator;//首次入院标志
    public String specialDepartment;//特殊科室
    public String insuranceID;//医疗保险证号码
    public String insuranceType;//医疗保险类型
    public String insuranceTypeCode;//医疗保险类型代码
    public String insurancePropety;//医疗保险属性
    public String insurancePropetyCode;//医疗保险属性代码
    public String emailAdress;//电子邮件地址
    public String mailingAdress;//通讯地址
    public String maillingAdressProvince;//通信地址(省、自治区、直辖市)
    public String maillingAdressCity;//通信地址市（地区）
    public String maillingAdressDistrict;//通信地址县（地区）
    public String maillingAdressTownLocality;//通信地址乡（镇、街道办事处）
    public String maillingAdressStreetName;//通信地址村（街、路、弄等）
    public String maillingAdressNumber;//通信地址-门牌号码
    public String maillingAdressPostalCode;//邮政编码
    public String mobelPhone;//移动电话号码
    public String homePhone;//家庭电话号码
    public String businessPhone;//单位电话号码 
}
