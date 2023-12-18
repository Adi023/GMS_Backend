package com.gms.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payment_info")
public class Payment {
	@Id
	private long transactionId;
	private long memberId;
	private Date transactionDate;
	private double transactionAmount;
	private String transactionPaymentMethod;
	private String transactionType;
	private String transctionDescription;
	private long transactionReceiptNumber;
	private boolean transactionStatus;
	

	
	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", memberId=" + memberId + ", transactionDate="
				+ transactionDate + ", transactionAmount=" + transactionAmount + ", transactionPaymentMethod="
				+ transactionPaymentMethod + ", transactionType=" + transactionType + ", transctionDescription="
				+ transctionDescription + ", transactionReceiptNumber=" + transactionReceiptNumber
				+ ", transactionStatus=" + transactionStatus + "]";
	}
	public Payment(long transactionId, long memberId, Date transactionDate, double transactionAmount,
			String transactionPaymentMethod, String transactionType, String transctionDescription,
			long transactionReceiptNumber, boolean transactionStatus) {
		super();
		this.transactionId = transactionId;
		this.memberId = memberId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.transactionPaymentMethod = transactionPaymentMethod;
		this.transactionType = transactionType;
		this.transctionDescription = transctionDescription;
		this.transactionReceiptNumber = transactionReceiptNumber;
		this.transactionStatus = transactionStatus;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionPaymentMethod() {
		return transactionPaymentMethod;
	}
	public void setTransactionPaymentMethod(String transactionPaymentMethod) {
		this.transactionPaymentMethod = transactionPaymentMethod;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransctionDescription() {
		return transctionDescription;
	}
	public void setTransctionDescription(String transctionDescription) {
		this.transctionDescription = transctionDescription;
	}
	public long getTransactionReceiptNumber() {
		return transactionReceiptNumber;
	}
	public void setTransactionReceiptNumber(long transactionReceiptNumber) {
		this.transactionReceiptNumber = transactionReceiptNumber;
	}
	public boolean isTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(boolean transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	
	
	
	
}
