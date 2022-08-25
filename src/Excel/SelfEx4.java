package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelfEx4 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
//	
//	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//	System.out.println(value);
	
	for(int i=0;i<10;i++) {
		for(int j=0;j<2;j++) {
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
	
	System.out.println(value);
		}
	
}
}}
