package com.mortal.TestSpringMVC1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortal.TestSpringMVC1.vo.User;

public interface UserDao extends JpaRepository<User, String> {
	List<User> findByCode(String code);
}
