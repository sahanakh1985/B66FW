package com.testng.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.testng.utilities.Constants.USER_DIR;
import static com.testng.utilities.Constants.APPLICATION_PROPERTIES;

public class CommonUtilities {

	public String getApplicationProperty(String key) throws IOException {

		String path = USER_DIR + File.separator + APPLICATION_PROPERTIES;

		Properties prop = new Properties();
		String value = "";
		FileInputStream fileInput = new FileInputStream(path);
		prop.load(fileInput);
		value = prop.getProperty(key);
		System.out.println("Value recieved :" + value);
		return value;

	}

}
