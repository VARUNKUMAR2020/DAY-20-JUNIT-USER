package Junit;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static String FirstName(String fName) {
		Pattern name = Pattern.compile("[A-Z][a-z]{2,}");
		Matcher checkName = name.matcher(fName);
		if (checkName.find()) {
			System.out.println("THANK YOU FOR ENTERING VALID USERNAME "); 
		} else {
			System.err.println("YOU HAVE ENTERED INVALID USERNAME ");
		}
		return fName;
	}

	public static void main(String[] args) {
		UserRegistration CheckName = new UserRegistration();
		System.out.println("USER REGISTRATION");
		Scanner firstName = new Scanner(System.in);
		System.out.println("ENTER THE USER NAME: ");
		String Name = firstName.nextLine();
		CheckName.FirstName(Name);

	}
}
