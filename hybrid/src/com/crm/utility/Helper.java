package com.crm.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	// Screenshot,windows,frame,alert

	public static void capturescrrenshort(WebDriver driver) {
	File src=	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src,new File("./screenshort/" +"Login"+ getcurrentdate() +".png")) ;
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("unable to capture screenshort"+ e.getMessage());
	}

	}
	public static void handlealert() {

	}
	public static void handlewindows() {

	}
	public  static void handleframe() {

	}
	public static String getcurrentdate() {
		
		DateFormat customformat =new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate=new Date();
	    return  customformat.format(currentdate);
		
		
		
	}


}
