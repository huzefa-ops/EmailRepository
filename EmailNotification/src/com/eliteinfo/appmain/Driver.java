package com.eliteinfo.appmain;
import com.eliteinfo.model.Employee;
import com.eliteinfo.service.*;
import java.util.Scanner;
public class Driver  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name");
		String firstname= sc.next();
		System.out.println("Enter Last name");
		String lastname= sc.next();
		System.out.println("Enter Department name");
		System.out.println("Enter from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice= sc.nextInt();
		CredentialService cs = new CredentialService();
		String email=null;
		String password=null;
		if(choice ==1)
		{
			Employee emp = new Employee(firstname, lastname , "Techincal");
			email=cs.generateEmail(firstname, lastname , "Techincal");
			password=cs.generatePassword();
			System.out.println("Email Id is: "+email);
			System.out.println("Your credentials are: "+password);
			cs.showCreds(emp, email, password);
		}else if (choice ==2)
		{
			Employee emp = new Employee(firstname, lastname , "Admin");
			email=cs.generateEmail(firstname, lastname , "Admin");
			password=cs.generatePassword();
			System.out.println("Email Id is:"+email);
			System.out.println("Your credentials are:"+password);
			cs.showCreds(emp, email, password);
		}else if (choice ==3)
		{
			Employee emp = new Employee(firstname, lastname , "Human Resource");
			email=cs.generateEmail(firstname, lastname , "HumanResource");
			password=cs.generatePassword();
			System.out.println("Email Id is:"+email);
			System.out.println("Your credentials are:"+password);
			cs.showCreds(emp, email, password);
		}else if (choice ==4) {
			Employee emp = new Employee(firstname, lastname , "Legal");
			email=cs.generateEmail(firstname, lastname , "Legal");
			password= cs.generatePassword();
			System.out.println("Email Id is:"+email);
			System.out.println("Your credentials are:"+password);
			cs.showCreds(emp, email, password);
		}else {
			System.out.println("Enter valid input");
				}
			/*
			switch(choice)
			{
				case 1: 		
					Employee e1 = new Employee(firstname, lastname, "Technical");
					break;
				case 2: 		
					e1 =new Employee(firstname, lastname, "Admin");
					break;
				case 3: 		
					e1 =new Employee(firstname, lastname, "Human Resource");
					break;
				case 4: 		
					e1 = new Employee(firstname, lastname, "Legal");
					break;
			}*/
		}
	}
