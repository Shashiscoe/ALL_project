import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src =new File("C:\\Users\\shashi\\Desktop\\MQFTE\\LCM.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int row=sheet1.getLastRowNum();
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<10;j++)
			{
				String r1=sheet1.getRow(i).getCell(j).getStringCellValue();
				//String r2=sheet1.getRow(i).getCell(5).getStringCellValue();
				if(r1.equals("MFG"))
				{
					System.out.print("      "+r1+ "                     ");
					
				}
				
			}
			System.out.println();
			
			//System.out.println(r1+": "+r2);
			
		}
	}

}
