package org.sn.utils;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ReadExcel {

    public static String[][] getExcelData(String filename) throws IOException {
        //String fileLocation = "./test-data/Login.xlsx";

        // 1. Open the workbook
        XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");

        // 2. Get the specific sheet (by index or name)
        XSSFSheet sheet = book.getSheetAt(0);
        int lastRowNum = sheet.getLastRowNum();
        int lastCellNum = sheet.getRow(0).getLastCellNum();

        // Initialize the data array to store Excel values (excluding header row)
        String[][] data = new String[lastRowNum][lastCellNum];

        // 3. Use DataFormatter to handle different data types (String, Numeric, etc.)
        DataFormatter format = new DataFormatter();

        // 4. Iterate through rows (start from 1 to skip headers) and columns
        for (int i = 1; i <= lastRowNum; i++) {
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < lastCellNum; j++) {
                XSSFCell cell = row.getCell(j);

                // Safely read the value as a String
                String value = "";
                if (cell != null) {
                    value = format.formatCellValue(cell);
                }

                data[i - 1][j] = value;
                System.out.print(value + " | ");
            }
            System.out.println();
        }

        // 5. Always close the workbook to avoid memory leaks
        book.close();
        return data;
    }
}
