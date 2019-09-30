package com.crm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	public XSSFWorkbook workbook ;
	public Exceldataprovider() throws IOException 
	{

		File src =new File("./testdata/data.xlsx");
		FileInputStream fileinputstream=new FileInputStream(src);
		workbook=new XSSFWorkbook(fileinputstream);
	}
// method overloading
	public String getstringdata( int sheetindex,int rowno,int cellno) {

		return	workbook.getSheetAt(sheetindex).getRow(rowno).getCell(cellno).getStringCellValue();


	}
	public String getstringdata( String sheetname,int rowno,int cellno) {

		return	workbook.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();


	}
	public double getnumericdata( String sheetname,int rowno,int cellno) {

		return	workbook.getSheet(sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();


	}



}
