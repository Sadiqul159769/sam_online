package sam_selenium_ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testxls {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File(
				"C:\\Users\\User\\eclipse-workspace\\sam_selenium\\src\\test\\resources\\test\\testdata.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);

		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);

		int data2 = (int) sheet1.getRow(0).getCell(2).getNumericCellValue();
		System.out.println("password is " + data2);

		int data3 = (int) sheet1.getRow(0).getCell(3).getNumericCellValue();
		System.out.println("password is " + data3);

		String data4 = sheet1.getRow(0).getCell(4).getStringCellValue();
		System.out.println("Full name " + data4);

		int data5 = (int) sheet1.getRow(0).getCell(5).getNumericCellValue();
		System.out.println("phone number " + data5);
		
		int data6 = (int) sheet1.getRow(0).getCell(6).getNumericCellValue();
		System.out.println("age " + data6);
		
		String data7 = sheet1.getRow(0).getCell(7).getStringCellValue();
		System.out.println("company " + data7);
		
	}
	

}
