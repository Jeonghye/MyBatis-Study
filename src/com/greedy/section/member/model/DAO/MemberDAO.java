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

}
