package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Auto.xlsx");
    
	String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(Data);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
