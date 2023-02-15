package com.greedy.section.member.model.service;

import com.greedy.section.member.model.DAO.MemberDAO;
import com.greedy.section.member.model.DTO.MemberDTO;

import static com.greedy.section.common.Template.getSqlSession;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberService {
	
	private final MemberDAO memberDAO;
	
	public MemberService() {
		this.memberDAO = new MemberDAO();
	}

	public boolean registNewMember(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.registNewMember(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public List<MemberDTO> selectAllMember() {
		
		SqlSession sqlSession = getSqlSession();
		
		List<MemberDTO> memberList = memberDAO.selectAllMember(sqlSession);
		
		sqlSession.close();
		
		return memberList;
	}

	public MemberDTO selectMemberById(String id) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberDTO member = memberDAO.selectMemberById(sqlSession, id);
		
		sqlSession.close();
		
		return member;
	}

	public List<MemberDTO> selectMemberByGender(String gender) {

		SqlSession sqlSession = getSqlSession();
		
		List<MemberDTO> memberList = memberDAO.selectMemberByGender(sqlSession, gender);
		
		sqlSession.close();
		
		return memberList;
	}

	public boolean updatePassword(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.updatePassword(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean updateEmail(MemberDTO member) {
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.updateEmail(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean updatePhone(MemberDTO member) {
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.updatePhone(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean updateAddress(MemberDTO member) {
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.updateAddress(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean deleteMember(MemberDTO member) {
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.deleteMember(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

}
