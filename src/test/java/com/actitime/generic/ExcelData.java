package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements AutoConstant {
	
	//to get data
	public static String getData(String path,String sheet,int rowNum,int cellNum) throws Exception
	{
		try
		{
			File f=new File(path);
			/*System.out.println(path+":"+sheet);
			System.out.println(rowNum);
			System.out.println(cellNum);*/
		FileInputStream fis=new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sh = workbook.getSheet(sheet);
		Row r = sh.getRow(rowNum);
		Cell cell = r.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;
		
		}
		catch(Exception e)
		{
			return " ";
		}
	}
	//to count the Rows
	public static int getRows(String path,String sheet) throws Exception
	{
		try
		{
		FileInputStream fis=new FileInputStream(new File(path));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sh = workbook.getSheet(sheet);
		int row = sh.getLastRowNum();
		return row;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//to count the cells
	public static int getCells(String path,String sheet,int rowNum) throws Exception
	{
		try
		{
		FileInputStream fis=new FileInputStream(new File(path));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sh = workbook.getSheet(sheet);
		 short cell = sh.getRow(rowNum).getLastCellNum();
		 return cell;
		 
	     }
	     catch(Exception e)
	     {
		  return 0;
	     }
	}
	

}
