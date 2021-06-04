package com.capgemini.author.personalDetails.main;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.author.personalDetails.models.AuthorModel;
import com.capgemini.author.personalDetails.services.AuthorManager;

public class AuthorMain {
	static AuthorManager am = new AuthorManager();
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String email;
	static char gender ;
	
	public static void main(String args[]) {
		
		char ch='y';
		while(ch=='y') {
		System.out.println("Enter the choice");
		String choice = sc.next();

		switch (choice) {
		case "readauthor":
			readAuthor();
			break;
		
		case "printdetails":
			Collection<AuthorModel> auth=am.getAllAuthors();
			System.out.println(auth);
			break;
			
			default:
				System.out.println("Wrong choice");
			}
		System.out.println("Do you want to continue (y/n)");
		ch=sc.next().trim().charAt(0);
		}
	}
	public static void readAuthor() {
		System.out.println("Enter name of the AUTHOR of the Book:");
		name=sc.next();
		
		System.out.println("Enter the particular Email id :");
		email=sc.next();
		
		System.out.println("Enter Gender: Male-m / Female-f / Unknown-u ");
		gender=sc.next().charAt(0);
	}
}