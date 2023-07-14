package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelutilities {
	FileInputStream excel;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public static String Locatorvalue;
	public static String Keywordvalue;
	public static String datavalue;
	public static String locatorname;
	public static String locatorelement;
	public  int excelrowcount;
	public  void readexcel(String location) throws Exception {

		excel=new FileInputStream(location);
		workbook=new XSSFWorkbook(excel);
		sheet=workbook.getSheetAt(2);	
		excelrowcount=sheet.getLastRowNum();
	}


	public void cellvaluefromEXCEL(int row, int locator, int Keyword, int data){


		Locatorvalue= sheet.getRow(row).getCell(locator).getStringCellValue();
		if(!Locatorvalue.equals("NA")) {
			locatorname=Locatorvalue.split("=")[0].toString().trim();
			locatorelement=Locatorvalue.split("=")[1].toString().trim();

			System.out.println(locatorname+" : "+locatorelement);
		}
		else {
			Locatorvalue="NA";
			System.out.println(Locatorvalue);
		}
		Keywordvalue= sheet.getRow(row).getCell(Keyword).getStringCellValue();

		datavalue= sheet.getRow(row).getCell(data).getStringCellValue();

		System.out.println(Locatorvalue +" "+ Keywordvalue+"  "+ datavalue);

	}
	
	
	
	
}
