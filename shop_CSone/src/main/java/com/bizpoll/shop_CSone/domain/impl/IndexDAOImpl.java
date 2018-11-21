package com.bizpoll.shop_CSone.domain.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bizpoll.shop_CSone.domain.IIndexDAO;
import com.bizpoll.shop_CSone.domain.ProductDTO;

// 구현체
@Repository
public class IndexDAOImpl implements IIndexDAO{

	@Override
	public List<ProductDTO> bestView() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> newView() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
