package com.gms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.dao.NutritionistDao;
import com.gms.model.Nutritionist;



@Service
public class NutritionistServiceImpl implements NutritionistServices{
	
	@Autowired
	NutritionistDao nutritionistDao;
	
	@Override
	public Nutritionist add_nutritionist(Nutritionist nutritionist) {

		return nutritionistDao.save(nutritionist);
	}

	@Override
	public void delete_nutritionist(long nutri_id) {
		
		nutritionistDao.deleteById(nutri_id);
	}

	@Override
	public Nutritionist view_nutritionistById(long nutritionist_id) {
		Optional <Nutritionist> admin=nutritionistDao.findById(nutritionist_id);
		return admin.get();
	}

	@Override
	public Iterable<Nutritionist> view_nutritionist() {
		
		return nutritionistDao.findAll();
	}

	@Override
	public Nutritionist update_nutritionist(Nutritionist nutritionist) {
		
		Optional <Nutritionist> adm=nutritionistDao.findById(nutritionist.getNutritionistId());
		
		Nutritionist a=adm.get();
		
		a.setNutritionistId(nutritionist.getNutritionistId());
		a.setNutritionistName(nutritionist.getNutritionistName());
		a.setNutritionistPassword(nutritionist.getNutritionistPassword());
		a.setNutritionistEmail(nutritionist.getNutritionistEmail());
		a.setNutritionistMobilenumber(nutritionist.getNutritionistMobilenumber());
		
		
	
		a=nutritionistDao.save(a);
		
		return a;
}
}