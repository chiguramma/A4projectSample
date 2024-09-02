package sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelIndividualData {

	public static void main(String[] args) throws Exception {
	   
		FileInputStream fis = new FileInputStream("C:\\SELENIUM//A4testData");
		 
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("sheet1");
		
		String value = sh.getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(value);

	}

}
