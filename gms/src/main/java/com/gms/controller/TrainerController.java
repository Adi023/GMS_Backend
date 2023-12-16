package com.gms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gms.model.Trainer;
import com.gms.service.TrainerServices;

public class TrainerController {

	@Autowired
	TrainerServices managerServices;
	
	@GetMapping("/trainer")
	public Iterable<Trainer> getTrainer(){
		return managerServices.view_trainer();
	}
	
	@GetMapping("/trainer/{trainer_id}")
	public Trainer getTrainerById(@PathVariable("trainer_id") long trainer_id) {
		return managerServices.view_trainerById(trainer_id);
	}
	
	@PostMapping("/trainer")
	public Trainer addTrainer(@RequestBody Trainer trainer) {
		return managerServices.add_trainer(trainer);
	}
	
	@PutMapping("/trainer/{trainer_id}")
	public Trainer updateTrainer(@RequestBody Trainer trainer) {
		return managerServices.update_trainer(trainer);
	}
	
	@DeleteMapping("/trainer/{trainer_id}")
	public String deleteTrainer(@PathVariable("trainer_id") long trainer_id) {
		managerServices.delete_trainer(trainer_id);
		
		return "Manager deleted Succesfully";
	}
}
