import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
	       
		FileInputStream fis = new FileInputStream("C:\\Users\\csc\\Desktop\\data.xls");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
			XSSFSheet sheet = workbook.getSheetAt(i);//here we reach to a perticular sheet
			
			Iterator<Row> rows = sheet.rowIterator();//moving in row
			Row firstrow = rows.next();//desired row ie 1st row
			Iterator<Cell> ce = firstrow.cellIterator();// moving in column
			int k=0;
			int column = 0;
			while(ce.hasNext())
			{
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase(testcaseName));
				{
					//desired column
					column=k;
				}
				k++;
			}
			System.out.println(column);
			//once column is identified than scan entire testcase column to identify purchase test case row
			
			while(rows.hasNext()) {
				Row r = rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
				{
					//after you grab purchase testcase row than pull all the data of that row and feed into test
					Iterator<Cell> cv = r.cellIterator();
					while(cv.hasNext())
					{
						Cell c= cv.next();
						if(c.getCellType()==CellType.STRING) 
						{
						a.add(cv.next().getStringCellValue());
					}
						else {
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
						}
				}
				
			}
			
		} 
			}
		return a;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			}

}
