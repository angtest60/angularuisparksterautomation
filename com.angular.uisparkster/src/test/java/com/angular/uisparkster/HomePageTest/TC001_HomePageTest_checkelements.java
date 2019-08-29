package com.angular.uisparkster.HomePageTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angular.uisparkster.PageActions.HomePage;
import com.angular.uisparkster.PageActions.LoginPage;
import com.angular.uisparkster.PageActions.WidgetsPage;
import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;





public class TC001_HomePageTest_checkelements  extends Testbase {
	
	
	
	 HomePage homepage;
	 WidgetsPage widgetspage;
	 TestUtils testutil;
	 
	 
	
	 public TC001_HomePageTest_checkelements() {
			
			super();
			
		}
	 
	 
	 @BeforeMethod
		public void setup()
		{
			initialization();
			//loginpage= new LoginPage();
			testutil= new TestUtils();
			homepage = new HomePage();
			widgetspage = new WidgetsPage();
			
		}
	 
	 
	 @Test(priority=1)
		public void checkinglogodisplayed()
	 {
			boolean logodisplayed = homepage.validateSparksterLogo();
			
		}
	 
	 @Test(priority=2)
		public void checking_clickingon_addcontainer()
	 {
			 homepage.addcontainer_click();
			
		}
	 
	 @Test(priority=3)
		public void checking_clickingon_widgetsicon()
	 {
			 homepage.WidgetsIcon_click();
			
		}
	 
	 
	 @Test(priority=4)
		public void checking_clickingon_textbox()
	 {
		     homepage.addcontainer_click();
		     homepage.WidgetsIcon_click();
		     widgetspage.widgets_Textbox_iconclick();
		     
		     
			
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
