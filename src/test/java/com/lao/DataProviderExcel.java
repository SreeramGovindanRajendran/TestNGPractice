package com.lao;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataProviderExcel {

    /*
need to declare all param from excel when using object[][] data provider
 */

    @Test(dataProvider = "excelData1")
    public void test1(String user, String name, String password) {
        System.out.println(user + " " + name + " " + password);
    }


    @DataProvider
    public Object[][] excelData1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Dev\\workspace\\TestNGPractice\\src\\main\\resources\\lao\\testdata.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowNum][colNum];

        for (int i = 1; i <= rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                data[i - 1][j] = value;
            }
        }
        return data;
    }

    /*
only declare map when using object[] data provider
 */
    @Test(dataProvider = "excelData")
    public void test2(Map<String, String> map) {
        System.out.println(map.get("user"));
        System.out.println(map.get("name"));
        System.out.println(map.get("password"));
    }


    /*
    returning the map for all the input parameters - more memory
     */
    @DataProvider
    public Object[] excelData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Dev\\workspace\\TestNGPractice\\src\\main\\resources\\tmb\\testdata.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();

        Object[] data = new Object[rowNum];
        Map<String, String> maps;

        for (int i = 1; i <= rowNum; i++) {
            maps = new LinkedHashMap<>();
            for (int j = 0; j < colNum; j++) {
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                maps.put(key, value);
                data[i - 1] = maps;
            }
        }
        return data;
    }

}
