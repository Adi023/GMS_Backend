package com.gms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gms.model.Nutritionist;
import com.gms.service.NutritionistServices;

public class NutritionistController {
	@Autowired
	NutritionistServices nutritionistServices;
	
	@GetMapping("/nutritionist")
	public Iterable<Nutritionist> getNutritionist(){
		return nutritionistServices.view_nutritionist();
	}
	
	@GetMapping("/nutritionist/{nutri_id}")
	public Nutritionist getNutritionistById(@PathVariable("nutri_id") long nutri_id) {
		return nutritionistServices.view_nutritionistById(nutri_id);
	}
	
	@PostMapping("/nutritionist")
	public Nutritionist addNutritionist(@RequestBody Nutritionist nutritionist) {
		return nutritionistServices.add_nutritionist(nutritionist);
	}
	
	@PutMapping("/nutritionist/{nutri_id}")
	public Nutritionist updateNutritionist(@RequestBody Nutritionist nutritionist) {
		return nutritionistServices.update_nutritionist(nutritionist);
	}
	
	@DeleteMapping("/nutritionist/{nutri_id}")
	public String deleteNutritionist(@PathVariable("nutri_id") long nutri_id) {
		nutritionistServices.delete_nutritionist(nutri_id);
		
		return "Manager deleted Succesfully";
	}

}
