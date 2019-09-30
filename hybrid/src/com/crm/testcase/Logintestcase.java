package com.crm.testcase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.crm.pages.Orangepages;
import com.crm.pages.baseclass;
import com.crm.utility.Helper;
//import com.crm.utility.Exceldataprovider;
public class Logintestcase extends baseclass {

	@Test
	public void loginapplication() 
	{
		//Exceldataprovider excel=new Exceldataprovider();
		Orangepages orangepages=	PageFactory.initElements(driver, Orangepages.class);
		orangepages.logindata("Admin","admin123");
		Helper.capturescrrenshort(driver);
	}

}