package com.bizpoll.shop_CSone.controller;

import java.io.IOException;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bizpoll.shop_CSone.service.IIndexService;


@Controller
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Inject
	private IIndexService service;
	
	@RequestMapping("/index")
	public String indexView(Model model) throws IOException{
		logger.info("=================> index 페이지 출력");
		
		// 베스트 상품 목록
		model.addAttribute("bestlist",service.bestView());
		
		// 신 상품 목록
		model.addAttribute("newlist",service.newView());
		
		
		return "index";
	}
}
