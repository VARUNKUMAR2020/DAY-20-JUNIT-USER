package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserRegistration {
	@Test
	public void firstNameTestCase() {
		String Expected1 = UserRegistration.FirstName("Varun");
		assertEquals("Varun", Expected1);
	}

	@Test
	public void lastNameTestCase() {
		String Expected2 = UserRegistration.FirstName("Kumar");
		assertEquals("Kumar", Expected2);
	}
}
