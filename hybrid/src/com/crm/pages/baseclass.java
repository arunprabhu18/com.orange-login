package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.crm.utility.Configurationproperty;
import com.crm.utility.Helper;
import com.crm.utility.browserfactory;

public class baseclass {
	public WebDriver driver ;
	public Configurationproperty config;
	 
	@BeforeSuite
	public void setupsuit() {
		config= new Configurationproperty();
	}
	
	@BeforeClass
	public void setup() {
	browserfactory.startapplication(driver, "chrome", "https://opensource-demo.orangehrmlive.com/");

	}

	
	
	@AfterClass
	public void teardown() {
		browserfactory.quitapllication(driver);
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			
			Helper.capturescrrenshort(driver);
			System.out.println("screenshort capture failed");
			
		} else if(result.getStatus()==ITestResult.SUCCESS) {
			Helper.capturescrrenshort(driver);
			System.out.println("screenshort capture succed");

		}
		
	}


}
