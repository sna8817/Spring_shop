package com.bizpoll.shop_CSone.dao.impl;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bizpoll.shop_CSone.dao.IIndexDAO;
import com.bizpoll.shop_CSone.dto.ProductDTO;

// 구현체
@Repository
public class IndexDAOImpl implements IIndexDAO{

	@Inject
	private SqlSession session;
	
	// MyBatis Mapper의 경로
	private static String namespace = "com.bizpoll.shop_CSone.mapper.indexMapper";
	
	
	@Override
	public List<ProductDTO> bestView() throws IOException {
		return session.selectList(namespace + ".bestView");
	}

	@Override
	public List<ProductDTO> newView() throws IOException {
		return session.selectList(namespace + ".newView");
	}

}
