package com.gl.itadmin.demo;
import java.util.Scanner;
import com.gl.itadmin.beans.*;
import com.gl.itadmin.services.*;


public class Demo {
	
	public static void main(String args[]){  
		//calling a default constructor  
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName = scr.next();
		
		System.out.println("Enter the Last Name");
		String lastName = scr.next();
		
		System.out.println("Enter the Department");
		String department = scr.next();
		
		Employee emp = new Employee(firstName, lastName, department);
		
		//set Email of employee using Employee Services
		EmployeeService esp = new EmployeeService();
		emp.setEmailId(esp.generateEmailId(emp));
		
		
		//set password of employee using Employee Services
		emp.setPassword(esp.generatePassword(emp));
		
		
		esp.showCredentials(emp);
		
		scr.close();
		
  
		}  

}
