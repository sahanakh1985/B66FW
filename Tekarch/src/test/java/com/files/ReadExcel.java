package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "D:/Selenium.xlsx";

		Workbook wb = WorkbookFactory.create(new FileInputStream(path));

		String v = wb.getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
		int rowsCount = wb.getSheet("sheet2").getLastRowNum();
		System.out.println("number of rows " + rowsCount);
		int cellCount = wb.getSheet("sheet2").getRow(0).getLastCellNum();
		System.out.println("number of cells " + cellCount);
		for (int i = 0; i <= rowsCount; i++) {
			try {
				cellCount = wb.getSheet("sheet2").getRow(i).getLastCellNum();
				for (int j = 0; j < cellCount; j++) {
					try {
						v = wb.getSheet("sheet2").getRow(i).getCell(j).getStringCellValue();
						System.out.print(v + " ");
					} catch (NullPointerException e) {
						System.out.print("-- ");
					}
				}
			} catch (NullPointerException e) {
				System.out.print("-- -- --");
			}
			System.out.println();
		}
		wb.close();

	}

}
