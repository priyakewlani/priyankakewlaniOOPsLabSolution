package com.gl.itadmin.services;

import com.gl.itadmin.beans.*;
import java.security.SecureRandom;
import java.util.Random;

public class EmployeeService {
	
	public String generateEmailId(Employee e) {
		
	 return e.getFirstName() + e.getLastName() +e.getDepartment() + "@gl.com";
		
	}
	
	public String generatePassword(Employee e) {
		
		 Random generator = new Random(); 
		 String SOURCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "@#$%^&*"; 
		 SecureRandom secureRnd = new SecureRandom();
		 StringBuilder sb = new StringBuilder(10); 
		 for (int i = 0; i < 10; i++) {
			 sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length()))); 
			 
			 }
		 return sb.toString();

			
	}
	
	public void showCredentials(Employee e) {
		
		 System.out.println("Employee mail id is"+ e.getEmailId());
		 System.out.println("Employee password is"+ e.getPassword());
			
	}
	

}
