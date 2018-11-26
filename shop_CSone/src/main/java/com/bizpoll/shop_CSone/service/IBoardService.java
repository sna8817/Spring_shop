package com.bizpoll.shop_CSone.service;

import java.io.IOException;
import java.util.List;

import com.bizpoll.shop_CSone.dto.BoardDTO;
import com.bizpoll.shop_CSone.dto.CriteriaDTO;

// 인터페이스
public interface IBoardService {
	
	// 게시글 목록 조회
	public List<BoardDTO> listAll(CriteriaDTO criDto) throws IOException;
	
	// 게시글 총 개수 구하기
	public int listCount(CriteriaDTO criDto) throws IOException;
	
	// 게시글 상세보기
	public BoardDTO viewBoard(int bno) throws IOException;
	
	// 게시글 등록
	public void registerBoard(BoardDTO bDto) throws IOException;
	
	// 게시글 수정
	public void modifyBoard(BoardDTO bDto) throws IOException;
	
	// 게시글 삭제
	public void removeBoard(int bno) throws IOException;

}
