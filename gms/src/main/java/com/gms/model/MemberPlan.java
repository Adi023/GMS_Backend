package com.gms.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MemberPlan_info")
public class MemberPlan {
	
	@Id
	private long memberPlanId;
	private long memberId;
	private long planId;
	private Date planStartDate;
	private Date planEndDate;
	


	@Override
	public String toString() {
		return "MemberPlan [memberId=" + memberId + ", memberPlanId=" + memberPlanId + ", planId=" + planId
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + "]";
	}




	public MemberPlan(long memberId, long memberPlanId, long planId, Date planStartDate, Date planEndDate) {
		super();
		this.memberId = memberId;
		this.memberPlanId = memberPlanId;
		this.planId = planId;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
	}




	public long getMemberId() {
		return memberId;
	}


	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}


	public long getMemberPlanId() {
		return memberPlanId;
	}


	public void setMemberPlanId(long memberPlanId) {
		this.memberPlanId = memberPlanId;
	}


	public long getPlanId() {
		return planId;
	}


	public void setPlanId(long planId) {
		this.planId = planId;
	}


	public Date getPlanStartDate() {
		return planStartDate;
	}


	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}


	public Date getPlanEndDate() {
		return planEndDate;
	}


	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}


	
	
	
	
	
	

}
