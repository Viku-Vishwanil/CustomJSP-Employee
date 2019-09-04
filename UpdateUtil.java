package edu.jspiders.hibernategenerator.util;

import edu.jspiders.hibernategenerator.dao.JspEmployeeDAO;

public class UpdateUtil 
{
	public static void main(String[] args) 
	{
		JspEmployeeDAO dao = new JspEmployeeDAO();
		
		dao.updateSalaryByName();
	}
}
