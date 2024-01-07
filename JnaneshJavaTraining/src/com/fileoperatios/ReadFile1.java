package com.fileoperatios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {

	public static void fileReader(String sPath) throws IOException {
		// open the file
		FileReader oFile = new FileReader(sPath);

		// read the file
		BufferedReader buffRead = new BufferedReader(oFile);
		System.out.println(buffRead.readLine());
		/*
		 * System.out.println(buffRead.readLine());
		 * System.out.println(buffRead.readLine());
		 * System.out.println(buffRead.readLine());
		 */
		// using while -loop for iteration , to read the file
		String sLines;

		while ((sLines = buffRead.readLine()) != null) {
			System.out.println(sLines);

		}

	}
	public static void main(String[] args) throws IOException {
		// 1.path of the file that need to be read
		String sPath = "E:\\ReadText.txt";
		System.out.println(sPath);
		fileReader(sPath);
	}
}
