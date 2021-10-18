package com.bridgelabzz.junituserregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration;

	@Before
	public void before() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstNameWhenProperShouldReturnTrue() {
		boolean result = userRegistration.firstName("Anant");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstNameWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.firstName("anant");
		Assert.assertFalse(result);
	}

	/**
	 * Unit test for validating last name
	 */
	@Test
	public void givenLastNameWhenProperShouldReturnTrue() {
		boolean result = userRegistration.lastName("Shinde");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastNameWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.lastName("shinde");
		Assert.assertFalse(result);
	}

}
