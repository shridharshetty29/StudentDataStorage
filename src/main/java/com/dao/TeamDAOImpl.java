package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;
/**
 * 
 * @author Shridhar
 * It inserts data into the table
 * which is Mapped into Student class
 *  with the help of hibernate framework.
 *
 */
@Repository
public class TeamDAOImpl implements TeamDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addTeam(List<Student> teamList) {
		for(int i = 0;i<teamList.size();i++)
		getCurrentSession().save(teamList.get(i));
	}

	@SuppressWarnings("unchecked")
	public List<Student> getTeamStructure() {
		return getCurrentSession().createQuery("from Student").list();
	}

	
	public int hqlTruncate(){
		String hql = String.format("delete from Student");
		return getCurrentSession().createQuery(hql).executeUpdate();
				
	}
		

}
