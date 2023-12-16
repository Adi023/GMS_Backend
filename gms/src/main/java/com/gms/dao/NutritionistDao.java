package com.gms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gms.model.Nutritionist;

@Repository
public interface NutritionistDao extends JpaRepository<Nutritionist, Long> {

}
