package com.file_operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	static String path = "D:\\SimpleText.txt";

	static FileReader fr;
	static BufferedReader bfd;

	public static void main(String[] args) throws IOException {
		try {
			readFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void readFile(String path) throws IOException {

		fr = new FileReader(path);

		bfd = new BufferedReader(fr);

		String sLine;
		while ((sLine = bfd.readLine()) != null) {
			System.out.println("Inside while loop");
			System.out.println(sLine);

		}

	}

}
