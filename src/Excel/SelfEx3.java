package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelfEx3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//Two coloumns data fetch
	
	for(int i=0;i<10;i++) {
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	
	System.out.println(value);
	}
	
	for(int i=0;i<10;i++) {
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
	
	System.out.println(value);
	}
	
	
	
	
	
	
}
}
