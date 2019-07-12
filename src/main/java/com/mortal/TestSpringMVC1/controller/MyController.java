package com.mortal.TestSpringMVC1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.mortal.TestSpringMVC1.service.GoodsService;
import com.mortal.TestSpringMVC1.service.UserService;
import com.mortal.TestSpringMVC1.vo.Goods;

@Controller
@RequestMapping("/")
public class MyController {

	@Autowired
	private GoodsService goodsService;
	@Autowired
	private UserService userService;	
	
	@RequestMapping("/findByName1")
	public String findByName1(String s,ModelMap mm)
	{
		List<Goods> list=goodsService.getSthByName(s);

		mm.put("aa",list);
		
		return "ok";
	}

	@ResponseBody
	@RequestMapping("/findByName")
	public String findByName(String s,ModelMap mm)
	{
		List<Goods> list=goodsService.getSthByName(s);

		
		return JSON.toJSONString(list);

	}

	
	@RequestMapping("/Login")
	public String Login(String s,String t,ModelMap mm)
	{
		boolean b=userService.login(s, t);
		if(b==true)
			return "main";
		else
			return "login";
	}

}
