package com.greedy.section2.common;

import java.util.List;

import com.greedy.section2.member.model.dto.MemberDTO;

public interface MemberMapper {

	int insertMember(MemberDTO member);

	List<MemberDTO> selectAllMember();

	MemberDTO selectMemberById(String id);

	List<MemberDTO> selectMemberByGender(String gender);

	int updatePassword(MemberDTO member);

	int updateEmail(MemberDTO member);

	int updatePhone(MemberDTO member);

	int updateAddress(MemberDTO member);

	int deleteMember(String id);


}
