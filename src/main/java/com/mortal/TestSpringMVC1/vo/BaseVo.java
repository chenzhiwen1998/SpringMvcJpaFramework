package com.mortal.TestSpringMVC1.vo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public abstract class BaseVo {
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
	
	
}
