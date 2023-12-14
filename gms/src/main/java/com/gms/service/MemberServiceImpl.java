package com.gms.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gms.dao.MemberDao;
import com.gms.model.Member;

@Service
public class MemberServiceImpl implements MemberServices {

	@Autowired
	MemberDao memberdao;
	
	@Override
	public Member add_member(Member member) {
		
		return memberdao.save(member);
		
	}

	@Override
	public void delete_member(long member_id) {
		
		memberdao.deleteById(member_id);
	}

	@Override
	public Iterable<Member> view_member() {
		
		return memberdao.findAll();
		
	}

	@Override
	public Member view_memberById(long member_id) {
		Optional<Member> m=memberdao.findById(member_id);
		return m.get();
	}

	@Override
	public Member update_member(Member member) {
		Optional<Member> mem=memberdao.findById(member.getMember_id());
		Member m=mem.get();
		m.setMember_id(member.getMember_id());
		m.setMember_name(member.getMember_name());
		m.setMember_password(member.getMember_password());
		m.setMember_address(member.getMember_address());
		m.setMember_mob_no(member.getMember_mob_no());
		m.setMember_email(member.getMember_email());
		m.setMember_gender(member.getMember_gender());
		m.setMember_DOB(member.getMember_DOB());
		m.setMember_DOJoining(member.getMember_DOJoining());
		m.setMember_status(member.getMember_status());
		
		
		m=memberdao.save(m);
		return m;
	}

}
