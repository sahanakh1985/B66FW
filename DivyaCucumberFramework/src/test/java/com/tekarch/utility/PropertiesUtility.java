package com.tekarch.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static com.tekarch.utility.Constants.USER_DIR;
import static com.tekarch.utility.Constants.APPLICATION_PROPERTIES;

public class PropertiesUtility {

	public String getApplicationProperty(String string) throws IOException {

		String sPath = USER_DIR + File.separator + APPLICATION_PROPERTIES;
		System.out.println(sPath);
		Properties property = new Properties();
		String value = "";
		FileInputStream fileInput = new FileInputStream(sPath);

		property.load(fileInput);
		value = property.getProperty(string);
		System.out.println("value recieved" + value);
		fileInput.close();
		return value;
	}

}
