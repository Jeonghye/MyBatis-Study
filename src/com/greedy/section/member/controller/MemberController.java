package com.greedy.section.member.controller;

import java.util.ArrayList;
import java.util.List;
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

	public void selectAllMembers() {

		List<MemberDTO> memberList = memberService.selectAllMember();
		
		if( memberList != null) {
			memberResultView.display(memberList);
		} else {
			memberResultView.displayDmlResult("selectFailed");
		}
	}

	public void searchMemberById(String id) {
		
		MemberDTO member = memberService.selectMemberById(id);
		
		if(member != null) {
			memberResultView.display(member);
		} else {
			memberResultView.displayDmlResult("selectFailed");
		}
	}

	public void searchMemberByGender(String inputGender) {
		
		List<MemberDTO> memberList = memberService.selectMemberByGender(inputGender);
		
		if( memberList != null) {
			memberResultView.display(memberList);
		} else {
			memberResultView.displayDmlResult("selectFailed");
		}
	}

	public void modifyPassword(String inputMemberId, String inputPassword) {
		
		String memberId = inputMemberId;
		String memberPwd = inputPassword;

		MemberDTO member = new MemberDTO();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		
		if(memberService.updatePassword(member)) {
			memberResultView.displayDmlResult("updateSuccess");
		} else {
			memberResultView.displayDmlResult("updateFailed");
		}
	}

	public void modifyEmail(String inputMemberId, String inputEmail) {
		String memberId = inputMemberId;
		String email = inputEmail;

		MemberDTO member = new MemberDTO();
		member.setMemberId(memberId);
		member.setEmail(email);
		
		if(memberService.updateEmail(member)) {
			memberResultView.displayDmlResult("updateSuccess");
		} else {
			memberResultView.displayDmlResult("updateFailed");
		}		
	}

	public void modifyPhone(String inputMemberId, String inputPhone) {
		String memberId = inputMemberId;
		String phone = inputPhone;

		MemberDTO member = new MemberDTO();
		member.setMemberId(memberId);
		member.setPhone(phone);
		
		if(memberService.updatePhone(member)) {
			memberResultView.displayDmlResult("updateSuccess");
		} else {
			memberResultView.displayDmlResult("updateFailed");
		}			
	}

	public void modifyAddress(String inputMemberId, String inputAddress) {
		String memberId = inputMemberId;
		String address = inputAddress;

		MemberDTO member = new MemberDTO();
		member.setMemberId(memberId);
		member.setAddress(address);
		
		if(memberService.updateAddress(member)) {
			memberResultView.displayDmlResult("updateSuccess");
		} else {
			memberResultView.displayDmlResult("updateFailed");
		}		}

	public void deleteMember(String inputMemberId) {
		
		MemberDTO member = new MemberDTO();
		member.setMemberId(inputMemberId);
		
		if(memberService.deleteMember(member)) {
			memberResultView.displayDmlResult("deleteSuccess");
		} else {
			memberResultView.displayDmlResult("deleteFailed");
		}
		
	}

}
