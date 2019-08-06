package FileBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test10 {
	public static void main(String[] args) throws Exception
	{
		//create and read the file
		File f=new File("./data/pradeep.xlsx");
		FileInputStream fs=new FileInputStream(f);
		//Create WorkBook
		Workbook wb = WorkbookFactory.create(fs);
		//to get sheet
		Sheet sh = wb.getSheet("Login");
		//get rows
		Row r = sh.getRow(0);
		//get cells
		Cell c = r.getCell(0);
		//get data
		String data = c.getStringCellValue();
		System.out.println(data);
		
		//to count number of used rows in a sheet and number of cells in a row
		//to count rows
		int lstRow = sh.getLastRowNum();
		System.out.println(lstRow);
		
		//to count cells in a sheet
		short lastCell = r.getLastCellNum();
		System.out.println(lastCell);
		
		
	}

}
