package com.mortal.TestSpringMVC1.service;

import java.util.List;

import com.mortal.TestSpringMVC1.vo.Goods;

public interface GoodsService {
	List<Goods> getAll();
	List<Goods> getSthByName(String name);
}
