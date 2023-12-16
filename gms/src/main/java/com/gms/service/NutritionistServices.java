package com.gms.service;

import com.gms.model.Nutritionist;

public interface NutritionistServices {
	
	public Nutritionist add_nutritionist(Nutritionist nutritionist);
	public void delete_nutritionist(long nutri_id);
	public Iterable<Nutritionist> view_nutritionist();
	Nutritionist view_nutritionistById(long nutri_id);
	public Nutritionist update_nutritionist(Nutritionist nutritionist);

}
