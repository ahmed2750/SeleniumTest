
package com.amazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ntestng {
	
		@BeforeSuite
		public void setUp() {
		System.out.println("setup system property for chrome");
		}
		@BeforeTest
		public void launchBroowser() {
			System.out.println("launchBroowser");
			
		}
	@BeforeClass 
	  public void login() {
		System.out.print("login to app");
		}
	
	@BeforeMethod 
	public void enterURL() {
		System.out.println("enterURL");
		
	}
	@Test
	public void  googlelogoTest() {
		System.out.println("google logo Test");
	}
		
	
	
	@Test
	  public void googleTitleTest() {
		System.out.println("google Title Test");
	}
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
		@AfterMethod
		public void logOut() {
			System.out.println("logout from app");
		}
		@AfterTest
		public void deleteAllCookies() {
			System.out.println("deleteAllCookies");
	
		}
		@AfterClass
		public void closebrowser() {
			
		}
	      @AfterSuite
	      public void generateTestReport() {
	    	  System.out.println();
	    		  
	    	  }
	      }
		
		
	
	
	
	
	

