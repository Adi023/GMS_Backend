package com.gms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gms.model.Member;
import com.gms.service.MemberServices;

@RestController
@RequestMapping("/gms")
@CrossOrigin
public class MemberController {

	@Autowired
	MemberServices memberservices;
	

	@GetMapping("/member")
	public Iterable<Member> getMember(){
		return memberservices.view_member();
	}
	
	@GetMapping("/member/{member_id}")
	public Member getMemberById(@PathVariable("member_id") long member_id) {
		return memberservices.view_memberById(member_id);
	}
	
	@PostMapping("/member")
	public Member addMember(@RequestBody Member member) {
		return memberservices.add_member(member);
	}
	
	@PutMapping("/member/{member_id}")
	public Member updateMember(@RequestBody Member member) {
		return memberservices.update_member(member);
	}
	
	@DeleteMapping("/member/{member_id}")
	public String deleteMember(@PathVariable("member_id") long member_id) {
		memberservices.delete_member(member_id);
		
		return "Member deleted Succesfully";
	}
}
