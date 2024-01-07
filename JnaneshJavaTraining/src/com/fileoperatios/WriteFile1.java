package com.fileoperatios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile1 {
	public static void main(String[] args) throws IOException {
		String sPath = System.getProperty("user.dir") + "./files1/WriteFile1.txt";
		System.out.println(sPath);

		FileWriter fileWriter;
		BufferedWriter bufferedWriter = null;

		try {
			fileWriter = new FileWriter(sPath, true);
			bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("hi , i am sahana");
			bufferedWriter.write("\n");
			bufferedWriter.write("i am learning java");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bufferedWriter.close();
		}
		ReadFile.readFile(sPath);

	}

}
