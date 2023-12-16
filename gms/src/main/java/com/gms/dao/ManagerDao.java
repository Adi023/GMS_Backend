package com.gms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gms.model.Manager;

public interface ManagerDao extends JpaRepository<Manager, Long> {

}
