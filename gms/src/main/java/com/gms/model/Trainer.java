package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer_info")
public class Trainer {
	
	@Id
	private long trainerId;
	private String trainerName;
	private String trainerPassword;
    private String trainerEmailId;
    private String trainerMobilenumber;
    private String trainerCertification;
    private String trainerSpecialization;
    private String trainerExperienceYears;
    private String trainerHireDate;
    private String trainerSalary;
    
    
   
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerPassword="
				+ trainerPassword + ", trainerEmailId=" + trainerEmailId + ", trainerMobilenumber="
				+ trainerMobilenumber + ", trainerCertification=" + trainerCertification + ", trainerSpecialization="
				+ trainerSpecialization + ", trainerExperienceYears=" + trainerExperienceYears + ", trainerHireDate="
				+ trainerHireDate + ", trainerSalary=" + trainerSalary + "]";
	}
	public Trainer(long trainerId, String trainerName, String trainerPassword, String trainerEmailId,
			String trainerMobilenumber, String trainerCertification, String trainerSpecialization,
			String trainerExperienceYears, String trainerHireDate, String trainerSalary) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerPassword = trainerPassword;
		this.trainerEmailId = trainerEmailId;
		this.trainerMobilenumber = trainerMobilenumber;
		this.trainerCertification = trainerCertification;
		this.trainerSpecialization = trainerSpecialization;
		this.trainerExperienceYears = trainerExperienceYears;
		this.trainerHireDate = trainerHireDate;
		this.trainerSalary = trainerSalary;
	}
	public long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerPassword() {
		return trainerPassword;
	}
	public void setTrainerPassword(String trainerPassword) {
		this.trainerPassword = trainerPassword;
	}
	public String getTrainerEmailId() {
		return trainerEmailId;
	}
	public void setTrainerEmailId(String trainerEmailId) {
		this.trainerEmailId = trainerEmailId;
	}
	public String getTrainerMobilenumber() {
		return trainerMobilenumber;
	}
	public void setTrainerMobilenumber(String trainerMobilenumber) {
		this.trainerMobilenumber = trainerMobilenumber;
	}
	public String getTrainerCertification() {
		return trainerCertification;
	}
	public void setTrainerCertification(String trainerCertification) {
		this.trainerCertification = trainerCertification;
	}
	public String getTrainerSpecialization() {
		return trainerSpecialization;
	}
	public void setTrainerSpecialization(String trainerSpecialization) {
		this.trainerSpecialization = trainerSpecialization;
	}
	public String getTrainerExperienceYears() {
		return trainerExperienceYears;
	}
	public void setTrainerExperienceYears(String trainerExperienceYears) {
		this.trainerExperienceYears = trainerExperienceYears;
	}
	public String getTrainerHireDate() {
		return trainerHireDate;
	}
	public void setTrainerHireDate(String trainerHireDate) {
		this.trainerHireDate = trainerHireDate;
	}
	public String getTrainerSalary() {
		return trainerSalary;
	}
	public void setTrainerSalary(String trainerSalary) {
		this.trainerSalary = trainerSalary;
	}
    
    
	
    
    
}

