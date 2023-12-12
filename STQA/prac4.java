// Update student records
package prac4;
import jxl.*;
import jxl.write.*;
import jxl.write.Number;
import java.io.*;
import java.util.Locale;
public class prac4 {
	public static void main(String args[]) throws IOException, WriteException {
		int r=0; int c=0;
		String header[]= {"student name", "marks1", "marks2", "marks3", "total"};
		String sname[]= {"rehmah", "neamah", "usamah","zeenat", "ahmed", "kashif", "saquib", "majida", "zaheer", "farida"};
		int marks[]= {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0};
		
		File file = new File("student.xls");
		WorkbookSettings wbsettings = new WorkbookSettings();
		WritableWorkbook workbook = Workbook.createWorkbook(file, wbsettings); 
		workbook.createSheet("sheet", 0);
		WritableSheet excelsheet = workbook.getSheet(0);
		
		for(r=0;r<1;r++) {
			for(c=0;c<header.length;c++) {
				Label l = new Label(c, r, header[c]);
				excelsheet.addCell(l);
			}
		}
		
		for(r=1;r<sname.length+1;r++) {
			for(c=0; c<1; c++) {
				Label l = new Label(c, r, sname[r-1]);
				excelsheet.addCell(l);
			}
		}
		for(r=1; r<sname.length+1;r++) {
			for(c=1; c<4; c++) {
				Number num = new Number(c, r, marks[r-1]);
				excelsheet.addCell(num);
			}
		}
		for(r=1; r<sname.length+1; r++) {
			for(c=4; c<5; c++) {
				int total = marks[r-1]+marks[r-1]+marks[r-1];
				Number num = new Number(c, r, total);
				excelsheet.addCell(num);
			}
		}
		workbook.write();
		workbook.close();
		System.out.println("Excel sheet created!");
	}
}
