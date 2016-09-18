package com.service;

import java.util.List;

import com.model.Student;
/**
 * 
 * @author Shridhar
 * this is an interface for TeamServiceImpl
 *
 */
public interface TeamService {
	
	public List<Student> getTeamStructure();

	public void addTeam(String teamStructure);

}
