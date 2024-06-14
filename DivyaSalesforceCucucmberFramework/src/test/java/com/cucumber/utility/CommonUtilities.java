package com.cucumber.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



import static com.cucumber.utility.Constants.USER_DIR;
import  static com.cucumber.utility.Constants.APPLICATION_PROPERTIES;

public class CommonUtilities {
	
	public String getApplicatinProperty(String key) throws IOException {
		String path=USER_DIR +File.separator+APPLICATION_PROPERTIES;
		System.out.println(path);
		Properties prop=new Properties();
		FileInputStream input=new FileInputStream(path);
		prop.load(input);
		String value = prop.getProperty(key);
		
		System.out.println("Value recieved:"+value);
		return value;
		
	}

}
