package prac5;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class prac5 {
	private String inputfile;
	public void setinputfile(String inputfile) {this.inputfile=inputfile;}
	public void read() throws IOException{
		File inputworkbook = new File(inputfile);
		Workbook w;
		boolean flag = false;
		int count = 0;
		try {
			w = Workbook.getWorkbook(inputworkbook);
			Sheet sheet = w.getSheet(0);
			for(int j=0; j<sheet.getRows();j++) {
				for(int i=0; i<sheet.getColumns()-1;i++) {
					Cell cell = sheet.getCell(i, j);
					if(cell.getType()==CellType.NUMBER) {
						if(Integer.parseInt(cell.getContents())>=60) {
							flag = true;
							if(flag==true){
								count+=1;
								flag=false;
							}
							break;
						}
					}
				}
			}
			System.out.println("Total number of Students who scored more than 60 marks: "+ count);
		}catch(BiffException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) throws IOException{
		prac5 test = new prac5();
		test.setinputfile("C:\\Users\\Admin\\eclipse-workspace\\Prac4\\student.xls");
		test.read();
	}
}

