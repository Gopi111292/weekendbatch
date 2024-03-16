package writingDataintoExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir") + "/Testdata/data2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();


		XSSFSheet sheet=workbook.createSheet();
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("12345");
		row1.createCell(2).setCellValue("xyz");
		
		XSSFRow row2=sheet.createRow(1);

		row2.createCell(0).setCellValue("abc");
		row2.createCell(1).setCellValue("4567");
		row2.createCell(2).setCellValue("testing");
		
		
		workbook.write(file1);
		workbook.close();
		file1.close();
		
		System.out.println("Writing is done!!!!");


	}

}
