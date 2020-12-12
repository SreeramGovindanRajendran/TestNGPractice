package com.testng.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedClass {

	@Test
	public void t1() {
		Assert.assertTrue(false, "Test case Passed");
	}
	
	@Test
	public void t2() {
		Assert.assertTrue(false, "Test case Passed");
	}
	
}
