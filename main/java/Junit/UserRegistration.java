package Junit;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static String FirstName(String fName) {
		Pattern name = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher checkFirstName = name.matcher(fName);
		if (checkFirstName.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID FIRST NAME "); 
		} else {
			System.err.println("YOU HAVE ENTERED INVALID FIRST NAME ");
		}
		return fName;
	}
	public static String lastName(String lName) {
		Pattern name = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher checkLastName = name.matcher(lName);
		if (checkLastName.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID LAST NAME "); 
		} else {
			System.err.println("YOU HAVE ENTERED INVALID LAST NAME ");
		}
		return lName;
	}
	public static String emailAddress(String mail) {
		Pattern email = Pattern.compile("^[a-z0-9]{1,}(@)[a-z]{1,}.[a-z]{1,3}$");
		Matcher checkmail = email.matcher(mail);
		if (checkmail.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID EMAIL "); 
		} else {
			System.err.println("YOU HAVE ENTERED INVALID EMAIL ");
		}
		return mail;
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
		Scanner email = new Scanner(System.in);
		System.out.println("ENTER THE EMAIL ADDRESS: ");
		String Email = lastName.nextLine();
		CheckName.emailAddress(Email);

	}
}
