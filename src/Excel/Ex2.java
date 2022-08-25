
package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Auto.xlsx");
	String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
	System.out.println(Data);
	
	
	
	
	
	
	
	
}
}
