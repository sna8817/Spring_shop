package com.bizpoll.shop_CSone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping("/index")
	public String indexView() {
		logger.info("=================> index 페이지 출력");
		
		// 베스트 상품 목록
		
		// 신 상품 목록
		
		
		
		return "index";
	}
}
