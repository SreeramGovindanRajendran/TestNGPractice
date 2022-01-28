package com.testng.learning;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class DataProviderExcel {

    @Test(dataProvider = "excelData1")
    public void test1(String user, String name, String password ){
        System.out.println(user +" "+ name+ " "+password);
    }

    /*
    returning the map for all the input parameters - more memory
     */
    @DataProvider
    public Object[][] excelData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Dev\\workspace\\TestNGPractice\\src\\test\\resources\\tmb\\data.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowNum][colNum];
        LinkedHashMap<String,String> map;

        for(int i=1;i<=rowNum;i++){
            map = new LinkedHashMap<>();
            for(int j=0;j<colNum;j++){
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key,value);
                data[i-1][j]=map;
            }
        }
        return data;
    }

    /*
   returning only the value for respective input parameters - less memory
    */

    @DataProvider
    public Object[][] excelData1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Dev\\workspace\\TestNGPractice\\src\\test\\resources\\tmb\\data.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowNum][colNum];

        for(int i=1;i<=rowNum;i++){
            for(int j=0;j<colNum;j++){
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                data[i-1][j]=value;
            }
        }
        return data;
    }

}
