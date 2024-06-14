package com.fileoperatios;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Properties {
	public static void main(String[] args) throws IOException {
		String sPath = System.getProperty("user.dir") + "/properties/application.properties";
		System.out.println(sPath);
		Properties prop = new Properties();
		FileInputStream fileInput = new FileInputStream(sPath);


	}
}
