package com.angular.widgettest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angular.uisparkster.PageActions.HomePage;
import com.angular.uisparkster.PageActions.WidgetsPage;
import com.angular.uisparkster.PageActions.WidgetsPage_Heading;
import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

public class Tc002_Widgets_Check  extends Testbase{


	 HomePage homepage;
	 WidgetsPage widgetspage;
	 WidgetsPage_Heading  widgetspage_heading;
	 TestUtils testutil;
	 
	 
	
	 public Tc002_Widgets_Check() {
			
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
			widgetspage_heading = new  WidgetsPage_Heading();
		}
	 
	 
/*	 @Test(priority=1)
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
	 */
	 
	 @Test(priority=4)
		public void checking_clickinandrenameg_heading() throws InterruptedException
	 {
		     homepage.addcontainer_click();
		     homepage.WidgetsIcon_click();
		     widgetspage_heading.widgets_heading_iconclick();
		     widgetspage_heading.rename_heading();
		     
		     
			
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
			//driver.quit();
		}
		
	
	}
	



