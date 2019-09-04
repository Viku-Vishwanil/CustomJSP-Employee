package edu.jspiders.hibernategenerator.util;

import edu.jspiders.hibernategenerator.dao.JspEmployeeDAO;
import edu.jspiders.hibernategenerator.dto.JspEmployeeDTO;

public class CreateUtil 
{
	public static void main(String[] args) 
	{
		JspEmployeeDTO jspemp = new JspEmployeeDTO();
		
		JspEmployeeDAO dao = new JspEmployeeDAO();
		
		jspemp.setFirstName("Rakshit");
		jspemp.setMiddleName("N/A");
		jspemp.setLastName("Kumar");
		jspemp.setsalary(25000); 
		
		dao.create(jspemp); 
		
		
		
	
	}

}
