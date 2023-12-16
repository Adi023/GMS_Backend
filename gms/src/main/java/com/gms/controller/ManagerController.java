package com.gms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gms.model.Manager;
import com.gms.service.ManagerServices;



public class ManagerController {
	
	@Autowired
	ManagerServices managerServices;
	
	@GetMapping("/manager")
	public Iterable<Manager> getAdmin(){
		return managerServices.view_manager();
	}
	
	@GetMapping("/manager/{managerId}")
	public Manager getManagerById(@PathVariable("managerId") long managerId) {
		return managerServices.view_managerById(managerId);
	}
	
	@PostMapping("/manager")
	public Manager addManager(@RequestBody Manager manager) {
		return managerServices.add_manager(manager);
	}
	
	@PutMapping("/manager/{managerId}")
	public Manager updateManager(@RequestBody Manager manager) {
		return managerServices.update_manager(manager);
	}
	
	@DeleteMapping("/manager/{managerId}")
	public String deleteManager(@PathVariable("managerId") long managerId) {
		managerServices.delete_manager(managerId);
		
		return "Manager deleted Succesfully";
	}
	

}
