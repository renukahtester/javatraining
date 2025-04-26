package com.property.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	/*
	 * step 1 : Create a Constructor()
	 * step 2 : Declare the File Location
	 * step 3 : get the data from the File
	 *          
	 *          FileInputStream ---> by using FIS user can get the Data from the file.
	 *          
	 * step 4 : create object for the properties, where properties is a class.
	 * step 5 : Declare the load, getProperty methods from the class properties.
	 *          load ---->load the data inside the properties
	 *          getProperty---> getProperty("url") from the .properties file

	 */
	Properties p;
	public ConfigurationReader() throws IOException {
		File loc = new File("D:\\Renuka\\Greens\\EW\\adactinTestng\\src\\data\\personaldata.properties");
		FileInputStream fis =  new FileInputStream(loc);
		p = new Properties();
		p.load(fis);
	}
	public String url() {
		String u = p.getProperty("url");
		return u;
	}
	public String userName() {
		String user = p.getProperty("user");
		return user;
	}
	public String password() {
		String pass = p.getProperty("pass");
		return pass;
	}
	public String address() {
		String add = p.getProperty("address");
		return add;
	}
	public String cvvnum() {
		String cvvno = p.getProperty("cvvnum");
		return cvvno;
	}
	public String ccnum() {
		String ccno = p.getProperty("ccnum");
		return ccno;
	}
}
