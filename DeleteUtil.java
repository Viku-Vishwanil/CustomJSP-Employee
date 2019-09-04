package edu.jspiders.hibernategenerator.util;

import edu.jspiders.hibernategenerator.dao.JspEmployeeDAO;


public class DeleteUtil
{
	public static void main(String[] args) 
	{
		JspEmployeeDAO dao = new JspEmployeeDAO();
		
		dao.deleteBySalary(15000);
	}
}
