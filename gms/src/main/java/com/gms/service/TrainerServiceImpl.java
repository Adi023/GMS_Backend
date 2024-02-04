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


	@Override
	public Trainer update_trainer(Trainer trainer) {
		
		Optional <Trainer> adm=trainerDao.findById(trainer.getTrainerId());
		
		Trainer a=adm.get();
		
		a.setTrainerId(trainer.getTrainerId());
		a.setTrainerName(trainer.getTrainerName());
		a.setTrainerPassword(trainer.getTrainerPassword());
		a.setTrainerEmailId(trainer.getTrainerEmailId());
		a.setTrainerMobilenumber(trainer.getTrainerMobilenumber());
		
		
		a=trainerDao.save(a);
		
		return a;
	}
}
