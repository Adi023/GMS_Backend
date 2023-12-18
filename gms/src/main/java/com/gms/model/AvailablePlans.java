package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Plan_info")
public class AvailablePlans {
	@Id
	private String planId;
	private String planName;
	private String planDescription;
	private String planPrice;
	private String planFeatures;
	private String planRestrictions;
	private String planDiscount;
	private String planBillingCycle;
	
	

	@Override
	public String toString() {
		return "AvailablePlans [planId=" + planId + ", planName=" + planName + ", planDescription=" + planDescription
				+ ", planPrice=" + planPrice + ", planFeatures=" + planFeatures + ", planRestrictions="
				+ planRestrictions + ", planDiscount=" + planDiscount + ", planBillingCycle=" + planBillingCycle + "]";
	}



	public AvailablePlans(String planId, String planName, String planDescription, String planPrice, String planFeatures,
			String planRestrictions, String planDiscount, String planBillingCycle) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planDescription = planDescription;
		this.planPrice = planPrice;
		this.planFeatures = planFeatures;
		this.planRestrictions = planRestrictions;
		this.planDiscount = planDiscount;
		this.planBillingCycle = planBillingCycle;
	}





	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public String getPlanPrice() {
		return planPrice;
	}
	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}
	public String getPlanFeatures() {
		return planFeatures;
	}
	public void setPlanFeatures(String planFeatures) {
		this.planFeatures = planFeatures;
	}
	public String getPlanRestrictions() {
		return planRestrictions;
	}
	public void setPlanRestrictions(String planRestrictions) {
		this.planRestrictions = planRestrictions;
	}
	public String getPlanDiscount() {
		return planDiscount;
	}
	public void setPlanDiscount(String planDiscount) {
		this.planDiscount = planDiscount;
	}
	public String getPlanBillingCycle() {
		return planBillingCycle;
	}
	public void setPlanBillingCycle(String planBillingCycle) {
		this.planBillingCycle = planBillingCycle;
	}
	
	
	
	
	

}
