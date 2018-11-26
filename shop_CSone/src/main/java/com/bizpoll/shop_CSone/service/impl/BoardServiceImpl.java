package com.bizpoll.shop_CSone.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bizpoll.shop_CSone.dto.BoardDTO;
import com.bizpoll.shop_CSone.dto.CriteriaDTO;
import com.bizpoll.shop_CSone.service.IBoardService;

// 구현체
@Service
public class BoardServiceImpl implements IBoardService{

	@Override
	public List<BoardDTO> listAll(CriteriaDTO criDto) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listCount(CriteriaDTO criDto) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDTO viewBoard(int bno) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerBoard(BoardDTO bDto) throws IOException {
		// TODO Auto-generated method stub
		
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
