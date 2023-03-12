package selenium1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterised 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException 
  {
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\data.xlsx\\");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	/*String LastCellValue=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(LastCellValue);*/
	int   RowIndex=sh.getLastRowNum();
	for(int i=0;i<=RowIndex;i++)
	{
		int cellIndex=sh.getRow(i).getLastCellNum()-1;
		for(int a=0;a<=cellIndex;a++)
		{
			String str=sh.getRow(i).getCell(a).getStringCellValue();
		
		System.out.println(str);
		
		}
	}
	
  }
}
