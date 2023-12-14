package com.gms.service;

import com.gms.model.Member;

public interface MemberServices {

	public Member add_member(Member member);
	public void delete_member(long member_id);
	public Iterable<Member> view_member();
	public Member view_memberById(long member_id) ;
	public Member update_member(Member member);
}
