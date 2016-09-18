package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Shridhar
 * This is a pojo of student class
 *
 */
@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String teamName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String tName) {
		this.teamName = tName;
	}

}
