package com.angular.widgettest;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angular.uisparkster.PageActions.HomePage.WidgetsPage;
import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;





public class widgetstest extends Testbase{


   WidgetsPage widgetspage;
   TestUtils testutil;
   

	 public widgetstest () {
		
		super();
		
	}




	 @BeforeMethod
		public void setup()
		{
			initialization();
			widgetspage= new WidgetsPage();
			testutil= new TestUtils();
			
			
			
		}



	 @Test(priority=1)
	 public void check_widgetpagee() throws Exception 
	 
	 {
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		
		 widgetspage=widgetspage.widgetcheck();



	 }


	 @AfterMethod
		public void tearDown(ITestResult result) throws EmailException, InterruptedException 
		
	 {
		
		 if(result.getStatus()==ITestResult.FAILURE)
		 {  
			
				try {
					// TestUtils.sendreportonemail();
					// Thread.sleep(10000);
					TestUtils.takeScreenshotAtEndOfTest(driver, result.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

		 }}}
