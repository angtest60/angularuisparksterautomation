package com.angular.uisparkster.LoginPageTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angular.uisparkster.PageActions.HomePage.HomePage;
import com.angular.uisparkster.PageActions.LoginPage.LoginPage;
import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class TC001_logintest extends Testbase {
	
	
	 LoginPage loginpage ;
	 HomePage homepage;
	 TestUtils testutil;
	
	
	 public TC001_logintest() {
			
			super();
			
		}
		
	 
	 
	 @BeforeMethod
	public void setup()
	{
		 initialization();
		loginpage= new LoginPage();
		testutil= new TestUtils();
		
		
		
	}


	 @Test(priority=1)
		public void loginPageTitleTest()
	 {
			String title = loginpage.validateLoginPageTitle();
			Assert.assertEquals(title, "Sparkster - Identity Server");
		}
	
	 
	 
	 @AfterMethod
		public void tearDown(ITestResult result)
	 {
		 if(result.getStatus()==ITestResult.FAILURE)
		 {
			 try {
				TestUtils.takeScreenshotAtEndOfTest(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			driver.quit();
		}
		
	 
	 

}
