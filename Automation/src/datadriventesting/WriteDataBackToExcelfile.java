package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataBackToExcelfile 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/createcustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("createcustomer").getRow(1).getCell(1).setCellValue("fail");
		FileOutputStream fos=new FileOutputStream("./data/createcustomer.xlsx");
		wb.write(fos);
	}
}
		


