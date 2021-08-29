package com.gl.itadmin.services;

import com.gl.itadmin.beans.*;

public class EmployeeService {
	
	public String generateEmailId(Employee e) {
		
	 return e.getFirstName() + e.getLastName() +e.getDepartment() + "@gl.com";
		
	}
	
	public String generatePassword(Employee e) {
		
		 return null;
			
	}
	
	public String showCredentials(Employee e) {
		
		 return null;
			
	}
	

}
