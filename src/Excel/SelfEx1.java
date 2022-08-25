package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelfEx1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(value);
	
	
	
	
	
	
	
	
	
	
}
}
