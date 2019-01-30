package com.jbk;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
  @Test
  public void loginTest() {
	  
	  System.out.println("login to amazon");
	  
	  ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/learn_Automation.html");
	  
	  ExtentReports extent = new  ExtentReports();
	  
	  extent.attachReporter(reporter);
	  
	  ExtentTest logger= extent.createTest("LoginTest");
	 
	  logger.log(Status.INFO, "Login to amazon");
	  
	  logger.log(Status.PASS, "Title Verified");
	  
	  extent.flush();
	 	  
	  
  }
}
