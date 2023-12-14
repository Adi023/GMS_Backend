package com.gms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gms.model.Member;

@Repository
public interface MemberDao extends JpaRepository<Member, Long> {

}
