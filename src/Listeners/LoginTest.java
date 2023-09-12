package Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LoginTest {
    @Test
	public void loginbyEmail() {
		System.out.println("Login By Email..");
		assertEquals("sahil", "sahil");
	}
	@Test
	public void loginbyFacebook() {
		System.out.println("Login By Facebook");
		assertEquals("sahil", "jenish");
	}
}
