package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Auto.xlsx");
	
	String B = WorkbookFactory.create(File).getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
	System.out.println(B);
	
	
	
}
}
