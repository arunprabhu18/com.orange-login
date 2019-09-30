package com.crm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configurationproperty {

	Properties property;
	public Configurationproperty()  {

		File src =new File("./configuration/config.properties");
		try {
			FileInputStream fileInputStream =new FileInputStream(src);
			Properties property=new Properties();
			property.load(fileInputStream);
		} catch (FileNotFoundException e) {

		} catch (Exception e) {
			System.out.println("not able to load config file"+e.getMessage());

		}



	}
	public String getdatafromconfig(String keytosearch) {
		
		return	property.getProperty("keyforsearch");

	}
	public String getbrowserfromconfig() {
		return	property.getProperty("browser");

	}
	public String geturlfromconfig() {
		return	property.getProperty("url");
	}

}
