package com.eliteinfo.service;
import java.util.*;
import com.eliteinfo.model.*;
public class CredentialService {
//Generate an email with the following syntax
	//firstnamelastname@department.company.com

public String generateEmail(String firstname , String lastname , String department) {
	return firstname+"."+lastname+"@"+department+".eliteinfo.com";
		
	}
//generate password

public String generatePassword() {
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String number = "0123456789";
	String SpecialCharacters = "!@#$%^&*_+=/.?<>";
	String value= capitalLetters+smallLetters+number+SpecialCharacters;
	
	Random random = new Random();
	char[] password = new char[8];
	for (int i=0;i<8;i++)
	{
		password[i]=  value.charAt(random.nextInt(value.length()));
		
	}
	
	return String.valueOf(password);	
}

//Random
//Show credentials
public void showCreds(Employee emp, String email, String password) {
	System.out.println("Hello "+emp.getFirstname()+" your genereated credential is: ");
	System.out.println("This is your "+email);
	System.out.println("This is you password "+password);
}
}