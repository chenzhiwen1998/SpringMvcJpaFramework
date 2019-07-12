package com.mortal.TestSpringMVC1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortal.TestSpringMVC1.vo.Goods;

public interface GoodsDao extends JpaRepository<Goods, String> {
	List<Goods> findByNameLike(String name);
}
