package entity;

import java.sql.Blob;


public class User {
	
	//必须信息
	private String username;//用户名
	private String password;//密码
	private String idcard;//身份证号
	private String name;//实名
	private String email;//电子邮箱
	
	
	//完善信息
	private String address;//地址
	private String job;//工作
	private String sex;//性别
	private String tel;//联系方式
	private Blob picture;//头像
	private String Introduction;//简介
	
	public User() {
		
	}
	public User(String username, String password, String idcard, String name,String email) {
	
		this.username = username;
		this.password = password;
		this.tel = null;
		this.idcard = idcard;
		this.name = name;
		this.email = email;
		this.address = null;
		this.job = null;
		this.sex = null;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	public String getIntroduction() {
		return Introduction;
	}
	public void setIntroduction(String introduction) {
		Introduction = introduction;
	}

}
