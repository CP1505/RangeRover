package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6BothColumnData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	
//	for(int i=0;i<10;i++) {
//		FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
//	
//	String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//	
//	System.out.println(Data);
//	}
//	
//	for(int i=0;i<10;i++) {
//		FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
//	
//	String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
//	
//	System.out.println(Data);
//	}
	
	
	
	for(int i=0;i<10;i++) {
		for(int j=0;j<2;j++) {
			
		
		FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
	
	System.out.println(i+" " +Data);
		}
	}
	
}
}
