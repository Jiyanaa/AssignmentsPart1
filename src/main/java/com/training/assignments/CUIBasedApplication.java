package com.training.assignments;

import java.util.Scanner;

import com.training.assignments.exception.InvalidInputException;

public class CUIBasedApplication {

	public static String login(String username, String password) throws InvalidInputException {
		Scanner sc = new Scanner(System.in);
		int j=0;
		String result = "";
		if(username.isEmpty() || password.isEmpty() || username.isBlank() || password.isBlank()) {
			throw new InvalidInputException("Username and password should not be empty");
		}
		
		for(int i=1;i<3;i++) {
			if(username.equals("admin") && password.equals("admin123")) {
				result = "Welcome "+username;
				break;
			}
			else {
				j=i+1;
				System.out.println("Wrong credentials-attempt: "+j);
				System.out.print("Enter user name:");
				username= sc.next();
				System.out.print("Enter password:");
				password = sc.next();
				
				if(username.isEmpty() || password.isEmpty()) {
					System.exit(0);
				}
				result  = "Contact Admin";
				
			}
		}
		return result;
	}
	
}
