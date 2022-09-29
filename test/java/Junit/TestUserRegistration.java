package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserRegistration {
	@Test
	public void userNameTestCase() {

		String Expected = UserRegistration.FirstName("Varun");
		assertEquals("Varun", Expected);

	}
}
