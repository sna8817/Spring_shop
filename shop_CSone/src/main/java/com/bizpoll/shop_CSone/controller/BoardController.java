package com.bizpoll.shop_CSone.controller;

import java.io.IOException;
import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bizpoll.shop_CSone.dto.BoardDTO;
import com.bizpoll.shop_CSone.dto.CriteriaDTO;
import com.bizpoll.shop_CSone.dto.PageMakerDTO;
import com.bizpoll.shop_CSone.service.IBoardService;

@RequestMapping("/board/*")
@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private IBoardService service;
	
	// 게시판 목록 조회
	@RequestMapping("list")
	public String boardList(CriteriaDTO criDto, PageMakerDTO pageMaker, Model model) throws IOException{
		logger.info("=================> 게시글 목록 출력");
		logger.info(criDto.toString());
		model.addAttribute("code", criDto.getCode());
		
		String flag = null;
		String keyword = null;
		if(criDto.getKeyword() != null) {
			System.out.println("==========================게시글검색기능 작동!!!!!");
			model.addAttribute("flag", criDto.getFlag());
			model.addAttribute("keyword", criDto.getKeyword());
		}
		
		// Servlet: DAO
		// Spring: Service -> DAO
		model.addAttribute("boardList", service.listAll(criDto));
		
		// 현재날짜 출력
		Date today = new Date();
		model.addAttribute("today", today);
		
		// 페이지네이션 생성
		pageMaker.setCriDto(criDto);
		pageMaker.setTotalCount(service.listCount(criDto));
		model.addAttribute("totalCount", pageMaker.getTotalCount());
		model.addAttribute("pageMaker", pageMaker);
		
		return "board/boardlist";
	}
	
	// 게시글 등록 View
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String boardRegisterView() throws IOException{
		logger.info("게시글 등록 View");
		return "board/boardinsert";
	}
	
	// 게시글 등록 Action
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String boardRegisterAcion(BoardDTO bDto) throws IOException{
		logger.info("게시글 등록 Action");
		logger.info(bDto.toString());
		// bDto에 게시글 등록할 값 담겨있음
		// DAO 게시글 등록 연결 <- 
		
		bDto.setFilename("-"); // Filename과 size가 명시되어있지 않기때문에 임의로 해줌!
		bDto.setFilesize(0);
		service.registerBoard(bDto); // service단으로 등록할 값가지고 감!
		logger.info("게시글 등록 후!!!!"+bDto.toString());
		
		return "redirect:/board/list";
	}
	
	// 게시글 수정
	@RequestMapping("modify")
	public String boardModify() throws IOException{
		return "";
	}
	
	// 게시글 삭제
	@RequestMapping("remove")
	public String boardRemove() throws IOException{
		return "";
	}
	
	
	
	
	
	
	
	
}
