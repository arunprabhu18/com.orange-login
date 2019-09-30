package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orangepages {

	// building constructor for initialize driver
	public WebDriver driver;
	public Orangepages(WebDriver idriver) {
		this.driver=idriver;
	}
	
	@FindBy(name="txtUsername") WebElement username ;
	@FindBy(name="txtPassword") WebElement password ;
	@FindBy(id="btnLogin") WebElement login ;
	
	public void logindata(String uname,String pword) {
		username.sendKeys(uname);
		password.sendKeys(pword);
		login.click();
		
	}
	
	
	
}
