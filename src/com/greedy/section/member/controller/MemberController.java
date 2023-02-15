package com.greedy.section.member.controller;

import java.util.Map;

import com.greedy.section.member.views.MemberResultView;
import com.greedy.section.member.model.service.MemberService;
import com.greedy.section.member.model.DTO.MemberDTO;

public class MemberController {
	
	private MemberResultView memberResultView = new MemberResultView();
	private MemberService memberService = new MemberService();

	public void registNewMember(Map<String, String> newUserInfo) {
		
		String memberId = newUserInfo.get("memberId");
		String memberPwd = newUserInfo.get("memberPwd");
		String memberName = newUserInfo.get("memberName");
		String gender = newUserInfo.get("gender");
		String email = newUserInfo.get("email");
		String phone = newUserInfo.get("phone");
		String address = newUserInfo.get("address");
		int age = Integer.parseInt(newUserInfo.get("age"));
		
		MemberDTO member = new MemberDTO();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setGender(gender);
		member.setEmail(email);
		member.setPhone(phone);
		member.setAddress(address);
		member.setAge(age);
		
		if(memberService.registNewMember(member)) {
			memberResultView.displayDmlResult("insertSuccess");
		} else {
			memberResultView.displayDmlResult("insertFailed");
		}
		
		
	}

}
