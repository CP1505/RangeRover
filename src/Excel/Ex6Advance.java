package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6Advance {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file;
	
	file=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	int Row = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println(Row);
	
	int Coloumn = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(Coloumn);
	for(int i=0;i<=Row;i++) {
		for(int j=0;j<Coloumn;j++) {
            file=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
			String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.print(Data);
		}System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
}
