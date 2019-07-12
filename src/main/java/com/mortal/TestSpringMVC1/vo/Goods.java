package com.mortal.TestSpringMVC1.vo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="goods")
public class Goods{
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
	
	
	@Column(nullable = false,columnDefinition = "varchar(40) comment '商品名称'")
	private String name;
	@Column(nullable = false,columnDefinition = "numeric(10,2) comment '价格'")
	private Double price;
	@Column(nullable = false,columnDefinition = "varchar(10) comment '单位'")
	private String unit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
