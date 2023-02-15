package com.greedy.section.member.model.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.section.member.model.DTO.MemberDTO;

public class MemberDAO {

	public int registNewMember(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.insert("MemberMapper.insertNewMember", member);
	}

	public List<MemberDTO> selectAllMember(SqlSession sqlSession) {
		return sqlSession.selectList("MemberMapper.selectAllMember");
	}

	public MemberDTO selectMemberById(SqlSession sqlSession, String id) {
		return sqlSession.selectOne("MemberMapper.selectMemberById", id);
	}

	public List<MemberDTO> selectMemberByGender(SqlSession sqlSession, String gender) {
		return sqlSession.selectList("MemberMapper.selectMemberByGender", gender);
	}

	public int updatePassword(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.update("MemberMapper.updatePassword", member);
	}

	public int updateEmail(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.update("MemberMapper.updateEmail", member);
	}

	public int updatePhone(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.update("MemberMapper.updatePhone", member);
	}

	public int updateAddress(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.update("MemberMapper.updateAddress", member);
	}

	public int deleteMember(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.delete("MemberMapper.deleteMember", member);
	}


}
