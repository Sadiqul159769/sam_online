import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {

	public static void main(String[] args) {
		
		ReadXLSdata red = new ReadXLSdata();
		red.getData("input");

	}
	public String[][] getData(String sheetname){
		File f= new File(System.getProperty("user_dir"+ "src\\test\\resources\\test\\testdata.xlsx"));
		FileInputStream fis = new FileInputStream();
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetName = wb.getSheetName(sheetname);
		
		//dynamically coloum and row select
		int totalRows= sheetName.getlastRowNum();
		System.out.print(totalRows);
		Row rowCells= sheetName.getRow(0);
		int totalCols = rowCells.getLastCellNum();
		System.out.println(totalCols);
		
		//how to do data formet
		
		DataFormetter dataformetter= new DataFormetter();
		
		String testData[][]= new String[totalRows][totalCols]
		for (int i=1; i<=totalRows; i++) {
			for (int j=0 ; j< totalCols; j++)
			{
				testData[i-1][j]=formar.formalCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		
		return testData;
	}

}
