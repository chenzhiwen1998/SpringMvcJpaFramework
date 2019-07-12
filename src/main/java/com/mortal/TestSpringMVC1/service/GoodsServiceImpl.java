package com.mortal.TestSpringMVC1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortal.TestSpringMVC1.dao.GoodsDao;
import com.mortal.TestSpringMVC1.vo.Goods;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsDao goodsDao;
	
	public List<Goods> getAll() {
		
		return goodsDao.findAll();

	}

	public List<Goods> getSthByName(String name) {
		return goodsDao.findByNameLike("%"+name+"%");
	}

}
