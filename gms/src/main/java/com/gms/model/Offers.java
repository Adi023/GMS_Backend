package com.gms.model;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Offers_info")
public class Offers {
	@Id
	private long offerId;
	private String offerName;
	private String offerDescription;
	private double offerDiscount;
	private Date offerStartDate;
	private Date offerEndDate;
	private String offerEligibility;
	private String offerTermsConditions;
	
	
	@Override
	public String toString() {
		return "Offers [offerId=" + offerId + ", offerName=" + offerName + ", offerDescription=" + offerDescription
				+ ", offerDiscount=" + offerDiscount + ", offerStartDate=" + offerStartDate + ", offerEndDate="
				+ offerEndDate + ", offerEligibility=" + offerEligibility + ", offerTermsConditions="
				+ offerTermsConditions + "]";
	}
	public Offers(long offerId, String offerName, String offerDescription, double offerDiscount, Date offerStartDate,
			Date offerEndDate, String offerEligibility, String offerTermsConditions) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerDescription = offerDescription;
		this.offerDiscount = offerDiscount;
		this.offerStartDate = offerStartDate;
		this.offerEndDate = offerEndDate;
		this.offerEligibility = offerEligibility;
		this.offerTermsConditions = offerTermsConditions;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferDescription() {
		return offerDescription;
	}
	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}
	public double getOfferDiscount() {
		return offerDiscount;
	}
	public void setOfferDiscount(double offerDiscount) {
		this.offerDiscount = offerDiscount;
	}
	public Date getOfferStartDate() {
		return offerStartDate;
	}
	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
	public Date getOfferEndDate() {
		return offerEndDate;
	}
	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}
	public String getOfferEligibility() {
		return offerEligibility;
	}
	public void setOfferEligibility(String offerEligibility) {
		this.offerEligibility = offerEligibility;
	}
	public String getOfferTermsConditions() {
		return offerTermsConditions;
	}
	public void setOfferTermsConditions(String offerTermsConditions) {
		this.offerTermsConditions = offerTermsConditions;
	}
	
	
	
	
}
