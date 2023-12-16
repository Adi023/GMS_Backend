package com.gms.service;


import com.gms.model.Trainer;

public interface TrainerServices {
	

	public Trainer add_trainer(Trainer trainer);
	public void delete_trainer(long trainer_id);
	public Iterable<Trainer> view_trainer();
	Trainer view_trainerById(long trainer_id);
	public Trainer update_trainer(Trainer trainer);

}
