package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Nutritionist_info")
public class Nutritionist {

	@Id
	private long nutritionistId;
	private String nutritionistName;
	private String nutritionistPassword;
    private String nutritionistEmail;
    private int nutritionistMobilenumber;
    private String nutritionistAddress;
    private String nutritionistSpecialization;
    private String nutritionistCertification;
    private String nutritionistAvailability;
    private double nutritionistConsultationFees;
    
    
   
   
	@Override
	public String toString() {
		return "Nutritionist [nutritionistId=" + nutritionistId + ", nutritionistName=" + nutritionistName
				+ ", nutritionistPassword=" + nutritionistPassword + ", nutritionistEmail=" + nutritionistEmail
				+ ", nutritionistMobilenumber=" + nutritionistMobilenumber + ", nutritionistAddress="
				+ nutritionistAddress + ", nutritionistSpecialization=" + nutritionistSpecialization
				+ ", nutritionistCertification=" + nutritionistCertification + ", nutritionistAvailability="
				+ nutritionistAvailability + ", nutritionistConsultationFees=" + nutritionistConsultationFees + "]";
	}




	public Nutritionist(long nutritionistId, String nutritionistName, String nutritionistPassword, String nutritionistEmail,
		int nutritionistMobilenumber, String nutritionistAddress, String nutritionistSpecialization,
		String nutritionistCertification, String nutritionistAvailability, double nutritionistConsultationFees) {
	super();
	this.nutritionistId = nutritionistId;
	this.nutritionistName = nutritionistName;
	this.nutritionistPassword = nutritionistPassword;
	this.nutritionistEmail = nutritionistEmail;
	this.nutritionistMobilenumber = nutritionistMobilenumber;
	this.nutritionistAddress = nutritionistAddress;
	this.nutritionistSpecialization = nutritionistSpecialization;
	this.nutritionistCertification = nutritionistCertification;
	this.nutritionistAvailability = nutritionistAvailability;
	this.nutritionistConsultationFees = nutritionistConsultationFees;
}




	public long getNutritionistId() {
		return nutritionistId;
	}
	public void setNutritionistId(long nutritionistId) {
		this.nutritionistId = nutritionistId;
	}
	public String getNutritionistName() {
		return nutritionistName;
	}
	public void setNutritionistName(String nutritionistName) {
		this.nutritionistName = nutritionistName;
	}
	public String getNutritionistPassword() {
		return nutritionistPassword;
	}
	public void setNutritionistPassword(String nutritionistPassword) {
		this.nutritionistPassword = nutritionistPassword;
	}
	public String getNutritionistEmail() {
		return nutritionistEmail;
	}
	public void setNutritionistEmail(String nutritionistEmail) {
		this.nutritionistEmail = nutritionistEmail;
	}
	public int getNutritionistMobilenumber() {
		return nutritionistMobilenumber;
	}
	public void setNutritionistMobilenumber(int nutritionistMobilenumber) {
		this.nutritionistMobilenumber = nutritionistMobilenumber;
	}
	public String getNutritionistAddress() {
		return nutritionistAddress;
	}
	public void setNutritionistAddress(String nutritionistAddress) {
		this.nutritionistAddress = nutritionistAddress;
	}
	public String getNutritionistSpecialization() {
		return nutritionistSpecialization;
	}
	public void setNutritionistSpecialization(String nutritionistSpecialization) {
		this.nutritionistSpecialization = nutritionistSpecialization;
	}
	public String getNutritionistCertification() {
		return nutritionistCertification;
	}
	public void setNutritionistCertification(String nutritionistCertification) {
		this.nutritionistCertification = nutritionistCertification;
	}
	public String getNutritionistAvailability() {
		return nutritionistAvailability;
	}
	public void setNutritionistAvailability(String nutritionistAvailability) {
		this.nutritionistAvailability = nutritionistAvailability;
	}
	public double getNutritionistConsultationFees() {
		return nutritionistConsultationFees;
	}
	public void setNutritionistConsultationFees(double nutritionistConsultationFees) {
		this.nutritionistConsultationFees = nutritionistConsultationFees;
	}
	
	
    
    
    
	
    
    
    
    
}
