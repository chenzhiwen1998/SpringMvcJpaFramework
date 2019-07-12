package com.mortal.TestSpringMVC1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortal.TestSpringMVC1.dao.UserDao;
import com.mortal.TestSpringMVC1.vo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean login(String code, String ps) {
		
		List<User> list=userDao.findByCode(code);
		if(list.size()==0)
		{
			//用户名错误
			return false;
		}
		else 
		{
			if(list.get(0).getPs().equals(ps))
				return true;
			else
			{
				//密码错误
				return false;
			}
		}
	}

}
