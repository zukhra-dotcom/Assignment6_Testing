package org.example.apachepoi;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class App {
    public static void main(String[] args) throws InterruptedException, IOException {

        String path = "C:\\Users\\fatiu\\Desktop\\People and Cities.xlsx";
        File file = new File(path);

        FileInputStream inputData = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(inputData);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        for(int i = 0; i <= rowcount; i++){

            int cellcount = sheet.getRow(i).getLastCellNum();

            System.out.println("Row Data: " + i);
            for (int j = 0; j < cellcount; j++){
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() + ", ");
            }
            System.out.println();
        }
    }
}