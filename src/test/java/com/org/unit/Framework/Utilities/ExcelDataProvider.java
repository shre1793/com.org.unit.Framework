package com.org.unit.Framework.Utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
  {
	
		  try {
			File src= new File("./TestData/Testdata.xlsx");
			FileInputStream fis=new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		  
  }
	
  public String getStringValue(String sheetname, int rown, int coln)
  {
	return wb.getSheet(sheetname).getRow(rown).getCell(coln).getStringCellValue(); 
  }
  
  public double getNumericValue(String sheetname, int rown, int coln)
  {
	return wb.getSheet(sheetname).getRow(rown).getCell(coln).getNumericCellValue();
  }

  public String getStringValue(int sheetindex, int rown, int coln)
  {
	return wb.getSheetAt(sheetindex).getRow(rown).getCell(coln).getStringCellValue(); 
  }
  
  public double getNumericValue(int sheetindex, int rown, int coln)
  {
	return wb.getSheetAt(sheetindex).getRow(rown).getCell(coln).getNumericCellValue();
  }

}
