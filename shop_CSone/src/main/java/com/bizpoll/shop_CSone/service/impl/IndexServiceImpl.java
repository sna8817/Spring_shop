package com.bizpoll.shop_CSone.service.impl;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bizpoll.shop_CSone.dao.IIndexDAO;
import com.bizpoll.shop_CSone.dto.ProductDTO;
import com.bizpoll.shop_CSone.service.IIndexService;
// 구현체

// Spring BEAN 으로 인식되기 위해 @Service 적용
@Service
public class IndexServiceImpl implements IIndexService{

	
	@Inject
	private IIndexDAO iDao;  // IIndexDAO bean->객체를 iDao에 담는다!
	// Inject 의존주입
	// Inject 자동 IINdexDAO 의 구현체들을 모두 autowired 해줌
	// 그러기 위해서 영속계층 즉 IndexDAOImpl에는 @Repository가 있어야 함.
	// 없으면 인식 불가
	
	
	@Override
	public List<ProductDTO> bestView() throws IOException {
		return iDao.bestView();
	}

	@Override
	public List<ProductDTO> newView() throws IOException {
		return iDao.newView();
	}
	 
}
