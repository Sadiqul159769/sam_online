import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\User\\eclipse-workspace\\sam_selenium\\src\\test\\resources\\test\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src); 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
	    String data0 =	sheet1.getRow(0).getCell(0).getStringCellValue();
	    
	   System.out.println("data from excel is "+data0 );

	}

}
