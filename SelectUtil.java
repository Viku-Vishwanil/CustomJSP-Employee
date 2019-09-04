package edu.jspiders.hibernategenerator.util;

import edu.jspiders.hibernategenerator.dao.JspEmployeeDAO;

public class SelectUtil 
{
	public static void main(String[] args) 
	{
		JspEmployeeDAO dao = new JspEmployeeDAO();
		
		dao.readAll();
		
	}
}
