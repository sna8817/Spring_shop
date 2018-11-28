package com.bizpoll.shop_CSone.service.impl;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bizpoll.shop_CSone.dao.IBoardDAO;
import com.bizpoll.shop_CSone.dto.BoardDTO;
import com.bizpoll.shop_CSone.dto.CriteriaDTO;
import com.bizpoll.shop_CSone.service.IBoardService;

// 구현체
@Service
public class BoardServiceImpl implements IBoardService{

	@Inject
	private IBoardDAO bDao;
	
	
	@Override
	public List<BoardDTO> listAll(CriteriaDTO criDto) throws IOException {
		// TODO Auto-generated method stub
		return bDao.listAll(criDto);
	}

	@Override
	public int listCount(CriteriaDTO criDto) throws IOException {
		// TODO Auto-generated method stub
		return bDao.listCount(criDto);
	}

	@Override
	public BoardDTO viewBoard(int bno) throws IOException {
		// TODO Auto-generated method stub
		return bDao.viewBoard(bno);
	}

	@Override
	public void registerBoard(BoardDTO bDto) throws IOException {
		// TODO Auto-generated method stub
		bDao.registerBoard(bDto);
	}

	@Override
	public void modifyBoard(BoardDTO bDto) throws IOException {
		// TODO Auto-generated method stub
		bDao.modifyBoard(bDto);
	}

	@Override
	public void removeBoard(int bno) throws IOException {
		// TODO Auto-generated method stub
		bDao.removeBoard(bno);
	}

}
