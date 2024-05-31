package DataDriven;

	import java.io.FileOutputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;
	public class WriteExcel {
		@Test
		void ExcelWrite() throws IOException {
			//open file to write
			FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\WriteData.xlsx");
			//Open workbook
			XSSFWorkbook workbook=new XSSFWorkbook();
			//Create Sheet
			XSSFSheet sheet=workbook.createSheet();
			XSSFRow row1=sheet.createRow(0);//create 1st row
			row1.createCell(0).setCellValue("Ramani");//write data into 1st cell
			row1.createCell(1).setCellValue("sairamanikokkirala@gmail.com");
			row1.createCell(2).setCellValue("Ramani@123");
			
			XSSFRow row2=sheet.createRow(1);//create 2nd row
			row2.createCell(0).setCellValue("RAMANI");
			row2.createCell(1).setCellValue("Kokkiralaramanidevi@gmail.com");
			row2.createCell(2).setCellValue("Sai@123");
			
			workbook.write(file);//this will write data into excel
			workbook.close();
			file.close();
			System.out.println("Writing completed");
		}
		
	
}
