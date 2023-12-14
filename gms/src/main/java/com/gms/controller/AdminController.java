package com.gms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gms.model.Admin;
import com.gms.service.AdminServices;

@RestController
@RequestMapping("/gms")
@CrossOrigin
public class AdminController {

	@Autowired
	AdminServices adminservices;
	
	@GetMapping("/admin")
	public Iterable<Admin> getAdmin(){
		return adminservices.view_admin();
	}
	
	@GetMapping("/admin/{admin_id}")
	public Admin getAdminById(@PathVariable("admin_id") long admin_id) {
		return adminservices.view_adminById(admin_id);
	}
	
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminservices.add_admin(admin);
	}
	
	@PutMapping("/admin/{admin_id}")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminservices.update_admin(admin);
	}
	
	@DeleteMapping("/admin/{admin_id}")
	public String deleteAdmin(@PathVariable("admin_id") long admin_id) {
		adminservices.delete_admin(admin_id);
		
		return "Admin deleted Succesfully";
	}
	
}
