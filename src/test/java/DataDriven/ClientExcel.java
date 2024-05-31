package DataDriven;

	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;
	public class ClientExcel {
		@Test
		void ExcelRead() throws IOException {
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\ClientData.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rows=sheet.getLastRowNum();//how many no of rows
			int cells=sheet.getRow(0).getLastCellNum();
			System.out.println(rows);
			System.out.println(cells);	
			for(int r=0;r<=rows;r++) {
				XSSFRow currentrow=sheet.getRow(r);
				for(int c=0;c<cells;c++) {
				//	XSSFCell cell=currentrow.getCell(c);//goto cell
					//String value=cell.toString();//read data from cell
					String value=currentrow.getCell(c).toString();
					
					System.out.print(value+" ");
				}
				System.out.println();
			}
			workbook.close();
			file.close();
			
		}
	}




