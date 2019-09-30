package com.crm.utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserfactory {
	public	 static WebDriver driver;
	public  static WebDriver startapplication(WebDriver driver, String browsername,String url)
	{

		if (browsername.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		else {
			System.out.println("browser is not present");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;

	}



	public  static void quitapllication(WebDriver driver) {
		driver.quit();



	}

}
