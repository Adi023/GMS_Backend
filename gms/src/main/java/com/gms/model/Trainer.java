package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer_info")
public class Trainer {
	@Id
	private long trainer_id;
	private String trainer_name;
	private String trainer_password;
    private String trainer_email;
    private String trainer_mobilenumber;
    
	@Override
	public String toString() {
		return "Trainer [trainer_id=" + trainer_id + ", trainer_name=" + trainer_name + ", trainer_password="
				+ trainer_password + ", trainer_emial=" + trainer_email + ", trainer_mobilenumber="
				+ trainer_mobilenumber + "]";
	}
	public Trainer(long trainer_id, String trainer_name, String trainer_password, String trainer_emial,
			String trainer_mobilenumber) {
		super();
		this.trainer_id = trainer_id;
		this.trainer_name = trainer_name;
		this.trainer_password = trainer_password;
		this.trainer_email = trainer_emial;
		this.trainer_mobilenumber = trainer_mobilenumber;
	}
	public long getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(long trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public String getTrainer_password() {
		return trainer_password;
	}
	public void setTrainer_password(String trainer_password) {
		this.trainer_password = trainer_password;
	}
	public String getTrainer_email() {
		return trainer_email;
	}
	public void setTrainer_email(String trainer_email) {
		this.trainer_email = trainer_email;
	}
	public String getTrainer_mobilenumber() {
		return trainer_mobilenumber;
	}
	public void setTrainer_mobilenumber(String trainer_mobilenumber) {
		this.trainer_mobilenumber = trainer_mobilenumber;
	}
    
    
}

