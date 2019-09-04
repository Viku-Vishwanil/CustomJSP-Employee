package edu.jspiders.hibernategenerator.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="jspiders_employee")
@Entity 
public class JspEmployeeDTO
{
	//@GenericGenerator(name = "myGen" , strategy="increment") // Create the Generator
	//@GeneratedValue(generator = "myGen")  // Use the Generator
	
	@GenericGenerator(name = "jspGen" , strategy="edu.jspiders.hibernategenerator.generator.JspIdGenerator")
	@GeneratedValue(generator = "jspGen")
	
	
	@Id
	@Column(name ="jsp_id")
	private String jspEmpId;
	@Column(name ="first_name")
	private String firstName;
	@Column(name ="middle_name")
	private String middleName;
	@Column(name ="last_name")
	private String lastName;
	@Column(name ="salary")
	private double salary;
	
	public JspEmployeeDTO() 
	{
		
	}

	public JspEmployeeDTO(String jspEmpId, String firstName, String middleName, String lastName, double salary) 
	{
		this.jspEmpId = jspEmpId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String jspEmpId() 
	{
		return jspEmpId;
	}

	public void setjspEmpId(String jspEmpId) 
	{
		this.jspEmpId = jspEmpId;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getMiddleName() 
	{
		return middleName;
	}

	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public double getsalary() 
	{
		return salary;
	}

	public void setsalary(double salary) 
	{
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "JspEmployeeDTO : - jspEmpId=" + jspEmpId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", salary=" + salary ;
	}
	
	
	
	

}
