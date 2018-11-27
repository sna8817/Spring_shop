package com.bizpoll.shop_CSone.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bizpoll.shop_CSone.dao.IBoardDAO;
import com.bizpoll.shop_CSone.dto.BoardDTO;
import com.bizpoll.shop_CSone.dto.CriteriaDTO;

@Repository
public class BoardDAOImpl implements IBoardDAO{

	@Autowired
	private SqlSession session;
	
	// MyBatis Mapper의 경로
	private static String namespace = "com.bizpoll.shop_CSone.mapper.boardMapper";
	
	
	@Override
	public List<BoardDTO> listAll(CriteriaDTO criDto) throws IOException {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".boardList", criDto);
	}

	@Override
	public int listCount(CriteriaDTO criDto) throws IOException {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".countPaging", criDto);
	}

	@Override
	public BoardDTO viewBoard(int bno) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerBoard(BoardDTO bDto) throws IOException {
		// TODO Auto-generated method stub
		session.insert(namespace + ".registerBoard", bDto);
	}

	@Override
	public void modifyBoard(BoardDTO bDto) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(int bno) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
