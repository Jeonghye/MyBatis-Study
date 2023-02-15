package com.greedy.section.member.model.DAO;

import org.apache.ibatis.session.SqlSession;

import com.greedy.section.member.model.DTO.MemberDTO;

public class MemberDAO {

	public int registNewMember(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.insert("MemberMapper.insertNewMember", member);
	}

}
