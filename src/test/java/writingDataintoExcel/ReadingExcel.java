package writingDataintoExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/Testdata/data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();

		System.out.println("Number of rows:" + totalrows); // 5
		System.out.println("Number of cells:" + totalcells); // 4
		
//		for(int r= 0; r<=totalrows;r++) {
//			XSSFRow currentRow=sheet.getRow(r);
//			for(int c=0;c<totalcells;c++) {
//				String value = currentRow.getCell(c).toString();
//				System.out.print(value +"    ");
//			}
//			
//			System.out.println();
//		}
		
		
		for(Row currentRow : sheet) {
			for(Cell currentCell :currentRow ) {
		        String value = String.valueOf(currentCell.toString());
		System.out.print(value +"    ");
			}
		
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
