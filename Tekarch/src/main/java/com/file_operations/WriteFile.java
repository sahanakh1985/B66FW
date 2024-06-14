package com.file_operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "/FileOperation/WriteFile.txt";

		FileWriter fw;
		BufferedWriter bfw = null;

		try {
			fw = new FileWriter(path);
			bfw = new BufferedWriter(fw);
			bfw.write("\n");
			bfw.write("I am learning java");

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			bfw.close();
		}
		ReadFile.readFile(path);

	}

}
