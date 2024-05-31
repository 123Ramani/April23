package DataDriven;

	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;
	public class ReadExcel {
		@Test
		void ExcelRead() throws IOException {
			//open file
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\LoginData.xlsx");
			//open workbook
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			//goto sheet
			XSSFSheet sheet=workbook.getSheet("Sheet1");//or getSheetAt(0) by index
			
			//goto row
			int rows=sheet.getLastRowNum();//how many no of rows
			int cells=sheet.getRow(0).getLastCellNum();//how many no of cells in 1 row
			
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


