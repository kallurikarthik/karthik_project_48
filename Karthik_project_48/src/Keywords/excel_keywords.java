package Keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_keywords
{

 static XSSFWorkbook book;
 static XSSFSheet sht;
 static XSSFRow row;
 static XSSFCell cell;
 public static String Filepath="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\src\\Resources\\";
 
 
 
 public static void get_workbook(String filename,String sheetname)
	{
		try {
			FileInputStream fi=new FileInputStream(Filepath+filename+".xlsx");
			System.out.println("Input file located");
			
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//This method return cell value from particular row number and cell number
	public static String get_cell_Data(int row, int cell)
	{
		return sht.getRow(row).getCell(cell).getStringCellValue();
	}
	
	
	//This method set New cell value using perticular row and cell number
	public static void set_cell_Data(int row, int cell,String celldata)
	{
		sht.getRow(row).getCell(cell).setCellValue(celldata);
	}
	
	
	//This method target requried sheet and return Entire sheet to method
	public static XSSFSheet get_sheet(String SheetName)
	{
		return sht=book.getSheet(SheetName);
	}
	
	//This method Save runtime data and Create output file
	public static void Save_And_Close_Workbook(String filename)
	{
		try {
			FileOutputStream fo=new FileOutputStream(Filepath+filename+".xlsx");
			book.write(fo);
			book.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
 		
	
	
}
