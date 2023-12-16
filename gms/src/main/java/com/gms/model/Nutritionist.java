package com.gms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Nutritionist_info")
public class Nutritionist {

	@Id
	private long nutri_id;
	private String nutri_name;
	private String nutri_password;
    private String nutri_email;
    private String nutri_mobilenumber;
    private String nutri_address;
    
    @Override
	public String toString() {
		return "Nutritionist [nutri_id=" + nutri_id + ", nutri_name=" + nutri_name + ", nutri_password="
				+ nutri_password + ", nutri_email=" + nutri_email + ", nutri_mobilenumber=" + nutri_mobilenumber
				+ ", nutri_address=" + nutri_address + "]";
	}
	public Nutritionist(long nutri_id, String nutri_name, String nutri_password, String nutri_email,
			String nutri_mobilenumber, String nutri_address) {
		super();
		this.nutri_id = nutri_id;
		this.nutri_name = nutri_name;
		this.nutri_password = nutri_password;
		this.nutri_email = nutri_email;
		this.nutri_mobilenumber = nutri_mobilenumber;
		this.nutri_address = nutri_address;
	}
	public long getNutri_id() {
		return nutri_id;
	}
	public void setNutri_id(long nutri_id) {
		this.nutri_id = nutri_id;
	}
	public String getNutri_name() {
		return nutri_name;
	}
	public void setNutri_name(String nutri_name) {
		this.nutri_name = nutri_name;
	}
	public String getNutri_password() {
		return nutri_password;
	}
	public void setNutri_password(String nutri_password) {
		this.nutri_password = nutri_password;
	}
	public String getNutri_email() {
		return nutri_email;
	}
	public void setNutri_email(String nutri_email) {
		this.nutri_email = nutri_email;
	}
	public String getNutri_mobilenumber() {
		return nutri_mobilenumber;
	}
	public void setNutri_mobilenumber(String nutri_mobilenumber) {
		this.nutri_mobilenumber = nutri_mobilenumber;
	}
	public String getNutri_address() {
		return nutri_address;
	}
	public void setNutri_address(String nutri_address) {
		this.nutri_address = nutri_address;
	}
    
    
    
}
