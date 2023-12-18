package com.gms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gms.dao.TrainerDao;
import com.gms.model.Trainer;

@Service
public class TrainerServiceImpl implements TrainerServices {
	

	@Autowired
	TrainerDao trainerDao;
	
	@Override
	public Trainer add_trainer(Trainer trainer) {

		return trainerDao.save(trainer);
	}

	@Override
	public void delete_trainer(long managerId) {
		
		trainerDao.deleteById(managerId);
	}

	@Override
	public Trainer view_trainerById(long trainer_id) {
		Optional <Trainer> admin=trainerDao.findById(trainer_id);
		return admin.get();
	}

	@Override
	public Iterable<Trainer> view_trainer() {
		
		return trainerDao.findAll();
	}

//	@Override
//	public Trainer update_trainer(Trainer trainer) {
		
//		Optional <Trainer> adm=trainerDao.findById(trainer.getTrainer_id());
		
//		Trainer a=adm.get();
		
//		a.setTrainer_id(trainer.getTrainer_id());
//		a.setTrainer_name(trainer.getTrainer_name());
//		a.setTrainer_password(trainer.getTrainer_password());
//		a.setTrainer_email(trainer.getTrainer_email());
//		a.setTrainer_mobilenumber(trainer.getTrainer_mobilenumber());
//		
		
//		a=trainerDao.save(a);
//		
//		return a;

}
