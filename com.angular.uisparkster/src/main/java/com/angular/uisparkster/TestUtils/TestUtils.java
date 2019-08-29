package com.angular.uisparkster.TestUtils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.angular.uisparkster.TestBase.Testbase;



public class TestUtils  extends Testbase {
	
	
	
	public static long PAGE_LOAD_TIMEOUT = 95;
	public static long IMPLICIT_WAIT = 95;
	public static long   setScriptTimeout = 95;
	
	public static WebDriverWait wait;
	 
	
	
	 
	//public static String TESTDATA_SHEET_PATH = "/Users/qa/testdata/TestData.xlsx";
	
	//static Workbook book;
	//static Sheet sheet;
	
	public static  void switchToFrame()
	{
		driver.switchTo().frame("");
	}
	

	public static void takeScreenshotAtEndOfTest(WebDriver driver , String screenshotname) throws IOException 
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
		
		//FileUtils.copyFile(scrFile, new File( "./screenshots/" + screenshotname + ".png"));

		//FileHandler.copyFile(scrFile, new File( "./screenshots/" + screenshotname + ".png"));
		
		FileHandler.copy(scrFile,new File( "./screenshots/" + screenshotname + ".png") );
	}

	
	public static void highLightElement(WebDriver driver, WebElement element)
	{
		
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	}
	
	
	
	
	
	
	
	   public static void sendreportonemail() throws EmailException 
	   
	   {
		   
		   
		   EmailAttachment attachment = new EmailAttachment();
		   
		   attachment.setPath("C:\\Users\\vedvyas.pb\\eclipse-workspace\\uiautomationSparkster\\test-output\\Sparkster_Extent.html");
		   attachment.setDisposition(EmailAttachment.ATTACHMENT);
		   attachment.setDescription("Picture of errors");
		   attachment.setName("sparkster");

		   
		   MultiPartEmail email = new MultiPartEmail();
		   
		   email.setHostName("smtp.googlemail.com");
		   //email.setSmtpPort(25);
		   email.setSmtpPort(465);
		   email.setAuthenticator(new DefaultAuthenticator("demoguddu@gmail.com", "demoguddu93"));
		   email.setSSLOnConnect(true);
		   email.addTo("vedvyas.testing@gmail.com", "vedvyas.pb");
		   
		   email.addCc("vedvyas.pb@syncoms.com", "vedvyas");
		   //email.addCc("amit.k@syncoms.com", "amit kumar");
		   
		   email.setFrom("demoguddu@gmail.com", "Vedvyas");
		   email.setSubject("The picture of sparkster");
		   email.setMsg("Here is the screenshot picture of saved document");

		   // add the attachment
		   email.attach(attachment);
		   
		   email.send();
		
		
	
	}
	   
	   
	


	 




public static void waitforwebdriver_visibilityelement(WebElement element)
{

	

	  wait = new WebDriverWait(driver, 40);

	// WebElement elemtobeclickable = wait.until(ExpectedConditions.elementToBeClickable(element));
	 WebElement elemtobevisible = wait.until(ExpectedConditions.visibilityOf(element));
	
	 
	
	   	
	
}

	
	
public static void webelementchkthroughsikuli(String png)	
{
	
	Screen screen = new Screen();
	
	Pattern pattern = new Pattern(png);
	
	
	
	
}
















}
