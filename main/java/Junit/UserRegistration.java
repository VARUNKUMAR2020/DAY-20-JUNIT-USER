package Junit;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static String FirstName(String fName) {
		Pattern name = Pattern.compile("[A-Z][a-z]{2,}");
		Matcher checkName = name.matcher(fName);
		if (checkName.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID FIRST NAME "); 
		} else {
			System.err.println("YOU HAVE ENTERED INVALID FIRST NAME ");
		}
		return fName;
	}
	public static String lastName(String lName) {
		Pattern name = Pattern.compile("[A-Z][a-z]{2,}");
		Matcher checkName = name.matcher(lName);
		if (checkName.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID LAST NAME "); 
		} else {
			System.err.println("YOU HAVE ENTERED INVALID LAST NAME ");
		}
		return lName;
	}

	public static void main(String[] args) {
		UserRegistration CheckName = new UserRegistration();
		System.out.println("USER REGISTRATION");
		Scanner firstName = new Scanner(System.in);
		System.out.println("ENTER THE USER NAME: ");
		String fname = firstName.nextLine();
		CheckName.FirstName(fname);
		Scanner lastName = new Scanner(System.in);
		System.out.println("ENTER THE LAST NAME: ");
		String lname = lastName.nextLine();
		CheckName.lastName(lname);
		

	}
}
