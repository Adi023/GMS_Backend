package com.gms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gms.model.Trainer;

@Repository
public interface TrainerDao extends JpaRepository<Trainer, Long> {

}
