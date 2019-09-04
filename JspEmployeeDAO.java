package edu.jspiders.hibernategenerator.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.jspiders.hibernategenerator.dto.JspEmployeeDTO;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class JspEmployeeDAO 
{
	public void create(JspEmployeeDTO jspemp)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		session.save(jspemp);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		session.close();
		
	}
	
	// Read All Employee Details---------->
	
	public JspEmployeeDTO readAll()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM JspEmployeeDTO";
		
		Query query = session.createQuery(hql);
		
		List<JspEmployeeDTO> list = query.list();
		
		for(JspEmployeeDTO student : list)
		{
			System.out.println(student);
			System.out.println("-----------------------------");
		}
		
		return null;
	}
	
	// Update Salary By Name ------------>
	
	public void updateSalaryByName()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "UPDATE JspEmployeeDTO set salary = 45000 where first_name = 'Imtiyaz'";
		
		Query query = session.createQuery(hql);
		
		int count = query.executeUpdate();
		
		session.beginTransaction().commit();
		
		System.out.println(count+" no. of Rows Affected");
	}
	
	// Delete Record By Salary--------->
	
	public void deleteBySalary(double salary)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "DELETE FROM JspEmployeeDTO where marks > :val";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("val", salary);
		
		int count = query.executeUpdate();
		
		session.beginTransaction().commit();
		
		System.out.println(count+" no. of Rows Affected");
	}
}
