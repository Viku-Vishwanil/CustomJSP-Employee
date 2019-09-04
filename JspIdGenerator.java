package edu.jspiders.hibernategenerator.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class JspIdGenerator implements IdentifierGenerator
{
	
	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) 
			throws HibernateException 
	{
		String name = "Jsp";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hehm15_db?user=root&password=root");
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("Select count(jsp_id) from jspiders_employee");
			
			if(rs.next())
			{
				Integer s=rs.getInt(1)+1;
				String s1 = name.format("%03d", s);
				 name=(name).concat(s1);
			}
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		return name ;
	}
}
