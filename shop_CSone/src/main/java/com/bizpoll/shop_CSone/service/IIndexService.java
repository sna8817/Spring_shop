package com.bizpoll.shop_CSone.service;

import java.io.IOException;
import java.util.List;

import com.bizpoll.shop_CSone.dto.ProductDTO;

// 인터페이스
public interface IIndexService {
	// 추상 메서드 생성
	
	// 베스트 상품 조회
	public List<ProductDTO> bestView() throws IOException;
	// 신상품 조회
	public List<ProductDTO> newView() throws IOException;
	
}
