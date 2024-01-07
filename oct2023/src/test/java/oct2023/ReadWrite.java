package oct2023;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	public static void main(String[] args) throws IOException {

		String sPath = System.getProperty("user.dir") + "\\excel\\oct2023.xlsx";
		System.out.println(sPath);
		FileInputStream fileInput = new FileInputStream(sPath);

		XSSFWorkbook wb = new XSSFWorkbook(fileInput);
		// HSSFWorkbook wb2=new HSSFWorkbook(fileInput);
		XSSFSheet sheet = wb.getSheet("sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		int rCount = sheet.getLastRowNum() + 1;
		System.out.println(rCount);
		int cCount = sheet.getRow(0).getLastCellNum();
		System.out.println(cCount);

		for (int i = 0; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {

				String value1 = wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1 + " ");
			}
			System.out.println();
		}

	}

}
