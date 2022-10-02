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

	public static String Mobile(String mobile) {
		Pattern cell = Pattern.compile("^[0-9]{1,2}[6-9]{1}[0-9]{9}$");
		Matcher check = cell.matcher(mobile);
		if (check.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID MOBILE NUMBER ");
		} else {
			System.err.println("YOU HAVE ENTERED INVALID MOBILE NUMBER");
		}
		return mobile;
	}

	public static String Password(String password) {
		Pattern security = Pattern.compile("^(.[0-9]{1,}[A-Z]{1,}){8,}$");
		Matcher check = security.matcher(password);
		if (check.find()) {
			System.out.println("THANK YOU FOR ENTERING PASSWORD ");
		} else {
			System.err.println("YOUR PASSWORD IS WEAK DOES NOT MATCHES TO THE CONDITION");
		}
		return password;
	}

	public static void main(String[] args) {
		UserRegistration Check = new UserRegistration();
		System.out.println("USER REGISTRATION");
		Scanner firstName = new Scanner(System.in);
		System.out.println("ENTER THE USER NAME: ");
		String fname = firstName.nextLine();
		Check.FirstName(fname);
		Scanner lastName = new Scanner(System.in);
		System.out.println("ENTER THE LAST NAME: ");
		String lname = lastName.nextLine();
		Check.lastName(lname);
		Scanner email = new Scanner(System.in);
		System.out.println("ENTER THE EMAIL ADDRESS: ");
		String Email = lastName.nextLine();
		Check.emailAddress(Email);
		Scanner cell = new Scanner(System.in);
		System.out.println("ENTER THE MOBILE NUMBER: ");
		String mobile = cell.nextLine();
		Check.Mobile(mobile);
		Scanner security = new Scanner(System.in);
		System.out.println("ENTER THE PASSWORD: ");
		String password = security.nextLine();
		Check.Password(password);

	}
}
