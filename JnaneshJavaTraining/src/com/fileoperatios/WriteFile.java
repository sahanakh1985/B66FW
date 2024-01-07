package com.fileoperatios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		String sPath = System.getProperty("user.dir") + "/files/WriteFile.txt";
		System.out.println(sPath);

		BufferedWriter obufferwriter = null;
		FileWriter oFileWriter;

		try {
			oFileWriter = new FileWriter(sPath, true);
			obufferwriter = new BufferedWriter(oFileWriter);

			obufferwriter.write("I am sahana.");
			obufferwriter.write("\n");

			obufferwriter.write("I know manual testing.");
			obufferwriter.write("\n");

			obufferwriter.write("I am lerning java.");
			obufferwriter.write("\n");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			obufferwriter.close();

		}
		ReadFile.readFile(sPath); // calling the method of ReadFile class from Write file class
	}

}
