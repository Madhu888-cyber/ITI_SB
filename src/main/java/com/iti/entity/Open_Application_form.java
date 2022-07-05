package com.iti.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="student_application")
public class Open_Application_form {

	@Id
	@Column
	@GeneratedValue(generator = "regidseq")
	@SequenceGenerator(name = "regidseq", sequenceName = "regidsequence", initialValue = 2200001, allocationSize = 1)
	private Long ssc_regno;
	@Column private Integer regid;
	@Column private String name;
	@Column private String fname;
	@Column private String addr;
	@Column private String mname;
	@Column private Long phno;
	@Column private String adarno;
	@Column private String gen;
	@Column private String caste;
	@Column private boolean ssc_passed;
	@Column private boolean inter_passed;
	@Column private Integer inter_marks;
	@Column private String locnoc;
	@Column private Integer pincode;
	@Column private String ts;
	@Column private String ip;
	@Column private String uid;
	@Column private boolean phc;
	@Column private boolean exs;
	@Column private String dob;
	@Column private Long trno;
	@Column private String ssc_board;
	@Column private String ssc_year;
	@Column private String ssc_month;
	@Column private Integer phase;
	@Column private String year;
	@Column private String university_area;
	@Column private String data_flag;
	@Column private String app_status;
	@Column private String user_id;
	@Column private String reason;
	@Column private String ssc_type;
	@Column private String email;
	@Column private String pwd_category;
	@Column private boolean ews;
	@Column private boolean is_trainee_dual_mode;
	@Column private Timestamp entry_date;
	@Column private Timestamp verified_date;
	@Column private String verified_ip;
	@Column private String ssc;
	@Column private String subjects;
	@Column private Integer first_lang_marks;
	@Column private Integer second_lang_marks;
	@Column private Integer eng_marks;
	@Column private Integer maths_marks;
	@Column private Integer science_marks;
	@Column private Integer social_marks;
	@Column private Integer tot_marks;
	//@Column private String photo;
	@Column private String aadhar;
	
	public Long getSsc_regno() {
		return ssc_regno;
	}
	public void setSsc_regno(Long ssc_regno) {
		this.ssc_regno = ssc_regno;
	}
	public Integer getRegid() {
		return regid;
	}
	public void setRegid(Integer regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getAdarno() {
		return adarno;
	}
	public void setAdarno(String adarno) {
		this.adarno = adarno;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public boolean isSsc_passed() {
		return ssc_passed;
	}
	public void setSsc_passed(boolean ssc_passed) {
		this.ssc_passed = ssc_passed;
	}
	public boolean isInter_passed() {
		return inter_passed;
	}
	public void setInter_passed(boolean inter_passed) {
		this.inter_passed = inter_passed;
	}
	public Integer getInter_marks() {
		return inter_marks;
	}
	public void setInter_marks(Integer inter_marks) {
		this.inter_marks = inter_marks;
	}
	public String getLocnoc() {
		return locnoc;
	}
	public void setLocnoc(String locnoc) {
		this.locnoc = locnoc;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public boolean isPhc() {
		return phc;
	}
	public void setPhc(boolean phc) {
		this.phc = phc;
	}
	public boolean isExs() {
		return exs;
	}
	public void setExs(boolean exs) {
		this.exs = exs;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getTrno() {
		return trno;
	}
	public void setTrno(Long trno) {
		this.trno = trno;
	}
	public String getSsc_board() {
		return ssc_board;
	}
	public void setSsc_board(String ssc_board) {
		this.ssc_board = ssc_board;
	}
	public String getSsc_year() {
		return ssc_year;
	}
	public void setSsc_year(String ssc_year) {
		this.ssc_year = ssc_year;
	}
	public String getSsc_month() {
		return ssc_month;
	}
	public void setSsc_month(String ssc_month) {
		this.ssc_month = ssc_month;
	}
	public Integer getPhase() {
		return phase;
	}
	public void setPhase(Integer phase) {
		this.phase = phase;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUniversity_area() {
		return university_area;
	}
	public void setUniversity_area(String university_area) {
		this.university_area = university_area;
	}
	public String getData_flag() {
		return data_flag;
	}
	public void setData_flag(String data_flag) {
		this.data_flag = data_flag;
	}
	public String getApp_status() {
		return app_status;
	}
	public void setApp_status(String app_status) {
		this.app_status = app_status;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSsc_type() {
		return ssc_type;
	}
	public void setSsc_type(String ssc_type) {
		this.ssc_type = ssc_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd_category() {
		return pwd_category;
	}
	public void setPwd_category(String pwd_category) {
		this.pwd_category = pwd_category;
	}
	public boolean isEws() {
		return ews;
	}
	public void setEws(boolean ews) {
		this.ews = ews;
	}
	public boolean isIs_trainee_dual_mode() {
		return is_trainee_dual_mode;
	}
	public void setIs_trainee_dual_mode(boolean is_trainee_dual_mode) {
		this.is_trainee_dual_mode = is_trainee_dual_mode;
	}
	public Timestamp getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Timestamp entry_date) {
		this.entry_date = entry_date;
	}
	public Timestamp getVerified_date() {
		return verified_date;
	}
	public void setVerified_date(Timestamp verified_date) {
		this.verified_date = verified_date;
	}
	public String getVerified_ip() {
		return verified_ip;
	}
	public void setVerified_ip(String verified_ip) {
		this.verified_ip = verified_ip;
	}
	public String getSsc() {
		return ssc;
	}
	public void setSsc(String ssc) {
		this.ssc = ssc;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public Integer getFirst_lang_marks() {
		return first_lang_marks;
	}
	public void setFirst_lang_marks(Integer first_lang_marks) {
		this.first_lang_marks = first_lang_marks;
	}
	public Integer getSecond_lang_marks() {
		return second_lang_marks;
	}
	public void setSecond_lang_marks(Integer second_lang_marks) {
		this.second_lang_marks = second_lang_marks;
	}
	public Integer getEng_marks() {
		return eng_marks;
	}
	public void setEng_marks(Integer eng_marks) {
		this.eng_marks = eng_marks;
	}
	public Integer getMaths_marks() {
		return maths_marks;
	}
	public void setMaths_marks(Integer maths_marks) {
		this.maths_marks = maths_marks;
	}
	public Integer getScience_marks() {
		return science_marks;
	}
	public void setScience_marks(Integer science_marks) {
		this.science_marks = science_marks;
	}
	public Integer getSocial_marks() {
		return social_marks;
	}
	public void setSocial_marks(Integer social_marks) {
		this.social_marks = social_marks;
	}
	public Integer getTot_marks() {
		return tot_marks;
	}
	public void setTot_marks(Integer tot_marks) {
		this.tot_marks = tot_marks;
	}
//	public String getPhoto() {
//		return photo;
//	}
//	public void setPhoto(String photo) {
//		this.photo = photo;
//	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	
}
