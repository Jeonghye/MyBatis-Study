package com.greedy.section2.member.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.section2.common.MemberMapper;
import com.greedy.section2.member.model.dto.MemberDTO;
import static com.greedy.section2.common.Template.getSqlSession;

public class MemberService {

	public boolean registNewMember(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int result = memberMapper.insertMember(member);
		
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
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		
		List<MemberDTO> memberList = memberMapper.selectAllMember();
		
		sqlSession.close();
		
		return memberList;
	}

	public MemberDTO selectMemberById(String id) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		
		MemberDTO member = memberMapper.selectMemberById(id);
		
		sqlSession.close();
		
		return member;
	}

	public List<MemberDTO> selectMemberByGender(String gender) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		
		List<MemberDTO> memberList = memberMapper.selectMemberByGender(gender);
		
		sqlSession.close();
		
		return memberList;
	}

	public boolean updatePassword(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int result = memberMapper.updatePassword(member);
		
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
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int result = memberMapper.updateEmail(member);
		
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
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int result = memberMapper.updatePhone(member);
		
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
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int result = memberMapper.updateAddress(member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean deleteMember(String id) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int result = memberMapper.deleteMember(id);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

}
