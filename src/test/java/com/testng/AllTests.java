package com.testng;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {

	@Test
	@BeforeMethod
	public void test1() {
		
	}
}
