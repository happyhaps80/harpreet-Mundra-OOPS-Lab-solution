package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialsService implements ICredentialsService {

	@Override
	public String generatePassword() {
		String capitalLetters ="ABCDEFGHIJKLMN";
		String smallCaseLetters ="abcdefgjikklmnopqr";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%&*_-<>";
		String values = capitalLetters + smallCaseLetters + numbers + specialCharacters;
		// randomly select a combination of all these different type of characters
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		int randomCharacters = 0;
		int randomCharacter;
		for (int index = 0; index <7; index++) {
		 randomCharacter = random.nextInt(values.length());
		 strBuffer.append(values.charAt(randomCharacter));
		}
		randomCharacter = random.nextInt(specialCharacters.length());
		strBuffer.append(specialCharacters.charAt(randomCharacter));
		return strBuffer.toString();
	}
	
	@Override
	public String getEmailAddress(String firstName, String lastName, String department) { 
		return firstName + lastName + "@" + department + "abc.com";
	}

	@Override
	public void showCredentials(Employee employee,String email,String generatePassword) {
		System.out.println("Dear" + employee.getFirstName()+ "your generated credentials are as follows");//Ctrl + Space tab)
		System.out.println("Email -> " + email);
		System.out.println("Password ->" + generatePassword);
		
	}

}
