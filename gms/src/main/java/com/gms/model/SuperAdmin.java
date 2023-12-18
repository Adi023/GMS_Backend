package com.gms.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SuperAdmin_info")
public class SuperAdmin {
	@Id
	private long superAdminId;
	private String superAdminPassword;
	private String superAdminEmail;
	private int superAdminMobileNumber;
	

	
	@Override
	public String toString() {
		return "SuperAdmin [superAdminId=" + superAdminId + ", superAdminPassword=" + superAdminPassword
				+ ", superAdminEmail=" + superAdminEmail + ", superAdminMobileNumber=" + superAdminMobileNumber + "]";
	}
	public SuperAdmin(long superAdminId, String superAdminPassword, String superAdminEmail,
			int superAdminMobileNumber) {
		super();
		this.superAdminId = superAdminId;
		this.superAdminPassword = superAdminPassword;
		this.superAdminEmail = superAdminEmail;
		this.superAdminMobileNumber = superAdminMobileNumber;
	}
	public long getSuperAdminId() {
		return superAdminId;
	}
	public void setSuperAdminId(long superAdminId) {
		this.superAdminId = superAdminId;
	}
	public String getSuperAdminPassword() {
		return superAdminPassword;
	}
	public void setSuperAdminPassword(String superAdminPassword) {
		this.superAdminPassword = superAdminPassword;
	}
	public String getSuperAdminEmail() {
		return superAdminEmail;
	}
	public void setSuperAdminEmail(String superAdminEmail) {
		this.superAdminEmail = superAdminEmail;
	}
	public int getSuperAdminMobileNumber() {
		return superAdminMobileNumber;
	}
	public void setSuperAdminMobileNumber(int superAdminMobileNumber) {
		this.superAdminMobileNumber = superAdminMobileNumber;
	}
	
	

}
