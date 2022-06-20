package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class DriverClass {
	private static final CredentialsService credentialServices  = new CredentialsService();
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter your first and last name");
		String firstName = sc.nextLine();
	    String lastName = sc.nextLine();
		Employee employee = new Employee("Harpreet", "Mundra");
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1) Technical" );
		System.out.println("2) HR");
		System.out.println("3) Admin");
		System.out.println("4) Legal");
		
	   
		
		
		int departmentNumber = sc.nextInt();
		
		switch(departmentNumber){
		case 1:{
			generatedPassword = credentialServices.generatePassword();
			generatedEmail = credentialServices.getEmailAddress(firstName,lastName,"Technical");
			credentialServices.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		
		case 2:{
			generatedPassword = credentialServices.generatePassword();
			generatedEmail = credentialServices.getEmailAddress(firstName,lastName,"HR");
			credentialServices.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
			
		case 3:{
			generatedPassword = credentialServices.generatePassword();
			generatedEmail = credentialServices.getEmailAddress(firstName,lastName,"Admin");
			credentialServices.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		
		case 4:{
			generatedPassword = credentialServices.generatePassword();
			generatedEmail = credentialServices.getEmailAddress(firstName,lastName,"Legal");
			credentialServices.showCredentials(employee, generatedEmail, generatedPassword);
		}
	}
	}
}

