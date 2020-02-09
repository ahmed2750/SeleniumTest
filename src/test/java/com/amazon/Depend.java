package com.amazon;

import org.testng.annotations.Test;

public class Depend {
	@Test
	public void loginTest() {
		System.out.println("login test");
		    int i = 9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomepageTest() {
		System.out.println("login test");
		
	
	}

}
