package com.file_operations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "/properties/ApplicationProperty.properties";

		Properties pr = new Properties();
		FileInputStream input = new FileInputStream(path);
		pr.load(input);

		String url = pr.getProperty("url");
		System.out.println("The url is :" + url);
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));

		FileOutputStream output = new FileOutputStream(path);
		pr.setProperty("url2", "https://www.google.com");
	}

}
