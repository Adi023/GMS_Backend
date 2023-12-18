package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	
@Table(name="Activity_Info")

public class Activities {

	@Id
	private String activtyId;
	private String activityName;
	private String activityTime;
	private String activityDescription;
	private String activityCapacity;
	
	
	@Override
	public String toString() {
		return "Activities [activtyId=" + activtyId + ", activityName=" + activityName + ", activityTime="
				+ activityTime + ", activityDescription=" + activityDescription + ", activityCapacity="
				+ activityCapacity + "]";
	}
	public Activities(String activtyId, String activityName, String activityTime, String activityDescription,
			String activityCapacity) {
		super();
		this.activtyId = activtyId;
		this.activityName = activityName;
		this.activityTime = activityTime;
		this.activityDescription = activityDescription;
		this.activityCapacity = activityCapacity;
	}
	public String getActivtyId() {
		return activtyId;
	}
	public void setActivtyId(String activtyId) {
		this.activtyId = activtyId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityTime() {
		return activityTime;
	}
	public void setActivityTime(String activityTime) {
		this.activityTime = activityTime;
	}
	public String getActivityDescription() {
		return activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}
	public String getActivityCapacity() {
		return activityCapacity;
	}
	public void setActivityCapacity(String activityCapacity) {
		this.activityCapacity = activityCapacity;
	}

	
	
	
}
