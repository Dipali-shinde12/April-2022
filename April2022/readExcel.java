package April2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream srcfile = new FileInputStream("D:\\adhu.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(srcfile);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//String = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		
	}

}
