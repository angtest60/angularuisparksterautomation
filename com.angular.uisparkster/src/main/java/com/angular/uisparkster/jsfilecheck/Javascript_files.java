package com.angular.uisparkster.jsfilecheck;



import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angular.uisparkster.TestBase.Testbase;

public class Javascript_files  extends Testbase{
	
	
	
                // public WebDriver driver;

//@BeforeMethod

//public void setup() {
	


/*}

@AfterMethod
public void tearDown() {
	driver.quit();
}
*/



public static  void extractJSlogsInfo() {
	
	
	DesiredCapabilities capibilties = DesiredCapabilities.chrome();
	LoggingPreferences logginPreferences = new LoggingPreferences();
	logginPreferences.enable(LogType.BROWSER, Level.ALL);
	capibilties.setCapability(CapabilityType.LOGGING_PREFS,logginPreferences );
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SET UP\\chromedriver.exe");	
    driver=new ChromeDriver(capibilties);
    


     LogEntries logEntries =driver.manage().logs().get(LogType.BROWSER);
     for(LogEntry entry : logEntries) {
	
	//System.out.println(new Date(entry.getTimestamp() + "" + entry.getLevel() + "" +entry.getMessage()));
	
	
	
	System.out.println(entry.getTimestamp() + "" + entry.getLevel() + "" +entry.getMessage());
	
	//driver.get("https://ui.invent.sparkster.me");
	
	
}

}

/*@Test
public void testMethod() {
	
	//driver.get("http://127.0.0.1:5500/uitesting/index.html");
	
	
	extractJSlogsInfo();
}

}*/



}




	
	
	
	
	
	
	


