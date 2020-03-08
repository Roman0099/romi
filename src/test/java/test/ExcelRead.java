package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        File file = new File("src/InventoryData.xlsx");
        // System.out.println(file.exists());
        //LOAD the fine into java memory using fileInputstream

        FileInputStream fileInputStream = new FileInputStream(file);
        //LOAD THE EXCEL WORKBOOK INTO THE JAVA CLASS

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        //getting the sheet

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        //How to get info from excel sheet
        System.out.println(sheet.getRow(0).getCell(0));
        System.out.println(sheet.getRow(0).getCell(1));
        System.out.println(sheet.getRow(0).getCell(2));
        System.out.println(sheet.getRow(0).getCell(3));

        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);


    }
}


