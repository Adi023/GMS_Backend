package com.gms.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Attendence_info")
public class Attendence {
	@Id
	private long attendenceId;
	private long memberId;
	private Date attendenceDate;
//	private LocalTime arrivalTime;
//	private LocalTime leftTime;
	
	
	public long getAttendenceId() {
		return attendenceId;
	}
	@Override
	public String toString() {
		return "Attendence [attendenceId=" + attendenceId + ", memberId=" + memberId + ", attendenceDate="
				+ attendenceDate + "]";
	}
	public Attendence(long attendenceId, long memberId, Date attendenceDate) {
	super();
	this.attendenceId = attendenceId;
	this.memberId = memberId;
	this.attendenceDate = attendenceDate;
}
	public void setAttendenceId(long attendenceId) {
		this.attendenceId = attendenceId;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public Date getAttendenceDate() {
		return attendenceDate;
	}
	public void setAttendenceDate(Date attendenceDate) {
		this.attendenceDate = attendenceDate;
	}
	
	
	
	
	
	

}
