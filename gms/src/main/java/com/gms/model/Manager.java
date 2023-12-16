package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="manager_info")
public class Manager {
	@Id
  private long managerId;
  private String managerName;
  private String managerEmailid;
  private String managerPassword;
  private long managerMobileNumber;
  private String managerBloodGroup;
  
  
  @Override
public String toString() {
	return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerEmailid=" + managerEmailid
			+ ", managerPassword=" + managerPassword + ", managerMobileNumber=" + managerMobileNumber
			+ ", managerBloodGroup=" + managerBloodGroup + "]";
}

  public Manager(long managerId, String managerName, String managerEmailid, String managerPassword,
			long managerMobileNumber, String managerBloodGroup) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerEmailid = managerEmailid;
		this.managerPassword = managerPassword;
		this.managerMobileNumber = managerMobileNumber;
		this.managerBloodGroup = managerBloodGroup;
	}

  
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public String getManagerEmailid() {
	return managerEmailid;
}
public void setManagerEmailid(String managerEmailid) {
	this.managerEmailid = managerEmailid;
}
public String getManagerPassword() {
	return managerPassword;
}
public void setManagerPassword(String managerPassword) {
	this.managerPassword = managerPassword;
}


public String getManagerBloodGroup() {
	return managerBloodGroup;
}
public void setManagerBloodGroup(String managerBloodGroup) {
	this.managerBloodGroup = managerBloodGroup;
}
public long getManagerId() {
	return managerId;
}

public void setManagerId(long managerId) {
	this.managerId = managerId;
}

public long getManagerMobileNumber() {
	return managerMobileNumber;
}

public void setManagerMobileNumber(long managerMobileNumber) {
	this.managerMobileNumber = managerMobileNumber;
}


}
