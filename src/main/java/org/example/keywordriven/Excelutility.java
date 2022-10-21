package org.example.keywordriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Excelutility {
    static XSSFWorkbook wb;
    static XSSFSheet sheet;

    public static void setExcel(String path, int sheetnum){
        try{
            File file = new File(path);
            FileInputStream src = new FileInputStream(file);
            wb = new XSSFWorkbook(src);
            sheet = wb.getSheetAt(sheetnum);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static String getData(int rownum, int cellnum){
        String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
        return data;
    }
}
