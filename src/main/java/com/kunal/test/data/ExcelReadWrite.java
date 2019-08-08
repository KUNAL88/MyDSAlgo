package com.kunal.test.data;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelReadWrite {

    public static void main(String[] args)throws Exception {


        FileInputStream fis=new FileInputStream("path");
        XSSFWorkbook w=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);

        Iterator<Row> rowIterator=s.rowIterator();

        while (rowIterator.hasNext()){
            Row r=rowIterator.next();
           Iterator<Cell> c= r.cellIterator();

           while (c.hasNext()){
               System.out.print(c.next().toString());
           }
        }
    }
}
