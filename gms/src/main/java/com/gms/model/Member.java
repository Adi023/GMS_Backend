package com.gms.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="member_info")
public class Member {

	@Id
	private long member_id;
	private String member_name;
	private String member_password;
	private String member_address;
	private long member_mob_no;
	private String member_email;
	private String member_gender;
	private Date member_DOB;
	private Date member_DOJoining;
	private String member_status;
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_name=" + member_name + ", member_password="
				+ member_password + ", member_address=" + member_address + ", member_mob_no=" + member_mob_no
				+ ", member_email=" + member_email + ", member_gender=" + member_gender + ", member_DOB=" + member_DOB
				+ ", member_DOJoining=" + member_DOJoining + ", member_status=" + member_status + "]";
	}

	public Member() {
		super();
	}
	
	public Member(long member_id, String member_name, String member_password, String member_address, long member_mob_no,
			String member_email, String member_gender, Date member_DOB, Date member_DOJoining, String member_status) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_password = member_password;
		this.member_address = member_address;
		this.member_mob_no = member_mob_no;
		this.member_email = member_email;
		this.member_gender = member_gender;
		this.member_DOB = member_DOB;
		this.member_DOJoining = member_DOJoining;
		this.member_status = member_status;
	}

	public long getMember_id() {
		return member_id;
	}
	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_password() {
		return member_password;
	}
	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}
	public String getMember_address() {
		return member_address;
	}
	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}
	public long getMember_mob_no() {
		return member_mob_no;
	}
	public void setMember_mob_no(long member_mob_no) {
		this.member_mob_no = member_mob_no;
	}
	public String getMember_gender() {
		return member_gender;
	}
	public void setMember_gender(String member_gender) {
		this.member_gender = member_gender;
	}
	public Date getMember_DOB() {
		return member_DOB;
	}
	public void setMember_DOB(Date member_DOB) {
		this.member_DOB = member_DOB;
	}
	public Date getMember_DOJoining() {
		return member_DOJoining;
	}
	public void setMember_DOJoining(Date member_DOJoining) {
		this.member_DOJoining = member_DOJoining;
	}
	public String getMember_status() {
		return member_status;
	}
	public void setMember_status(String member_status) {
		this.member_status = member_status;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
	
}
