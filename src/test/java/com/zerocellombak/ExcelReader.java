package com.zerocellombak;

import com.creditdatamw.zerocell.Reader;
import org.testng.annotations.Test;

import java.io.File;

public class ExcelReader {

    @Test
    public void readExcel(){
        Reader.of(TestData.class)
                .from(new File(System.getProperty("user.dir")+"/src/test/resources/lao/testdata.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list()
                .stream()
                .forEach(System.out::println);
    }
}
