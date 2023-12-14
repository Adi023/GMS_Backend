package com.gms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gms.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {

}
