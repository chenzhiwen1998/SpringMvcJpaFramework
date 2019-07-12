package com.mortal.TestSpringMVC1.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class User {
	@Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    @Column(name = "id",columnDefinition = "varchar(32)")
	private String ID;

	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	
	@Column(nullable = false,columnDefinition = "varchar(40) comment '用户名'")
	private String name;
	@Column(nullable = false,columnDefinition = "varchar(40) comment '账号'")
	private String code;
	@Column(nullable = false,columnDefinition = "varchar(10) comment '密码'")
	private String ps;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	
}
