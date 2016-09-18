package com.dao;

import java.util.List;

import com.model.Student;
/**
 * 
 * @author Shridhar
 *This a interface for TeamDaoImpl
 *
 */
public interface TeamDAO {
	
	public void addTeam(List<Student> lis);
	public List<Student> getTeamStructure();
	public int hqlTruncate();
}
