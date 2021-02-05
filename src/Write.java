import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("E:\\Selenium\\Write.xlsx"); //path of excel file
		Workbook wb = WorkbookFactory.create(fis);                             //loading the excel file     
		//Sheet sh = wb.getSheet("Sheet1"); 
		//Sheet sh = wb.createSheet("VALIDLOGIN");
		Sheet sh = wb.getSheet("VALIDLOGIN");
		Cell cl = sh.createRow(0).createCell(0);
		cl.setCellValue("USERNAME");
		sh.getRow(0).createCell(1).setCellValue("password");
		sh.createRow(1).createCell(0).setCellValue("Admin");
		sh.getRow(1).createCell(1).setCellValue("Manager");
		sh.createRow(2).createCell(0).setCellValue("SuShant");
		sh.getRow(2).createCell(1).setCellValue("Sushant@12345");
		FileOutputStream fio= new FileOutputStream("E:\\Selenium\\Write.xlsx");
		wb.write(fio);
		System.out.println("Done");
		wb.close();
	
	}

}
