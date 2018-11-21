package com.bizpoll.shop_CSone.domain;

import java.io.IOException;
import java.util.List;

// 인터페이스
public interface IIndexDAO {
	// 베스트 상품 목록 조회
	public List<ProductDTO> bestView() throws IOException;
	
	// 신상품 목록 조회
	public List<ProductDTO> newView() throws IOException;
}
