package Junit;

import static org.junit.Assert.*;
import org.junit.*;


public class UserRegistrationTest {
	UserRegistration Test = new UserRegistration();
	@Test
	public void firstNameTestCase() {
		
		String Expected1 = Test.FirstName("Varun");
		Assert.assertEquals("Varun", Expected1);
	}

	@Test
	public void lastNameTestCase() {
		String Expected2 = Test.lastName("Kumar");
		Assert.assertEquals("Kumar", Expected2);
	}
	@Test
	public void emailTestCase() {
		String Expected3 = Test.emailAddress("varunvenkat2020@gmail.com");
		Assert.assertEquals("varunvenkat2020@gmail.com", Expected3);
	}
	
	@Test
	public void mobileNumberCase() {
		String Expected4 = Test.Mobile("918870187077");
		Assert.assertEquals("918870187077", Expected4);
	}
	@Test
	public void passwordTestCase() {
		String Expected4 = Test.Password("VVsuwjsi");
		Assert.assertEquals("VVsuwjsi", Expected4);
	}
}

