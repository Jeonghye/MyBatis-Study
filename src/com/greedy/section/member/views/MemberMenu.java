package com.greedy.section.member.views;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.section.member.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {

		MemberController memberController = new MemberController();

		do {
			System.out.println("\n *** 회원 관리 프로그램 *** \n");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 모든 회원 조회");
			System.out.println("3. 아이디로 회원 조회");
			System.out.println("4. 성별로 회원 조회");
			System.out.println("5. 암호 수정");
			System.out.println("6. 이메일 변경");
			System.out.println("7. 전화번호 변경");
			System.out.println("8. 주소 변경");
			System.out.println("9. 회원 탈퇴");
			System.out.print("번호 선택 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : memberController.registNewMember(inputMember()); break;
			case 2 : memberController.selectAllMembers(); break;
//			case 3 : memberController.searchMemberById(inputMemberId()); break;
//			case 4 : memberController.searchMemberByGender(inputGender()); break;
//			case 5 : memberController.modifyPassword(inputMemberId(), inputPassword()); break;
//			case 6 : memberController.modifyEmail(inputMemberId(), inputEmail()); break;
//			case 7 : memberController.modifyPhone(inputMemberId(), inputPhone()); break;
//			case 8 : memberController.modifyAddress(inputMemberId(), inputAddress()); break;
//			case 9 : memberController.deleteMember(inputMemberId()); break;
			case 0 : return;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}


		} while(true);

	}

	private String inputMemberId() {
		System.out.print("회원 아이디 : ");
		sc.nextLine();

		return sc.nextLine();
	}


	private Map<String, String> inputMember() {

		sc.nextLine();
		System.out.print("가입할 아이디를 입력해주세요 : ");
		String memberId = sc.nextLine();
		System.out.print("가입할 비밀번호를 입력해주세요 : ");
		String memberPwd = sc.nextLine();
		System.out.print("성명을 입력해주세요 : ");
		String memberName = sc.nextLine();
		System.out.print("성별을 입력해주세요(F/M) : ");
		String gender = sc.nextLine().toUpperCase();
		System.out.print("이메일을 입력해주세요 : ");
		String email = sc.nextLine();
		System.out.print("폰번호를 입력해주세요 : ");
		String phone = sc.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		String age = sc.nextLine();

		Map<String, String> newUserInfo = new HashMap<>();

		newUserInfo.put("memberId", memberId);
		newUserInfo.put("memberPwd", memberPwd);
		newUserInfo.put("memberName", memberName);
		newUserInfo.put("gender", gender);
		newUserInfo.put("email", email);
		newUserInfo.put("phone", phone);
		newUserInfo.put("address", address);
		newUserInfo.put("age", age);

		return newUserInfo;
	}

	private Object inputGender() {
		
		System.out.print("조회할 성별 입력(남:M/여:F) : ");
		sc.nextLine();

		return sc.nextLine().toUpperCase();
	}

	private Object inputAddress() {
		
		System.out.print("수정할 주소 입력 : ");

		return sc.nextLine();
	}

	private Object inputPhone() {
		
		System.out.print("수정할 전화번호 입력 : ");

		return sc.nextLine();
	}

	private Object inputEmail() {
		
		System.out.print("수정할 이메일 입력 : ");

		return sc.nextLine();
	}

	private Object inputPassword() {

		System.out.print("수정할 비밀번호 입력 : ");

		return sc.nextLine();
	}


}
