package sam_selenium_ui;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoClass {
	
	public static ChromeDriver driver;
	public static String data0; 
	public static void main(String[] args) throws InterruptedException, Exception {
		
		
		File src = new File("C:\\Users\\User\\eclipse-workspace\\sam_selenium\\src\\test\\resources\\test\\testdata.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data0);

		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		//System.out.println(data1);

		int data2 = (int) sheet1.getRow(0).getCell(2).getNumericCellValue();
		String pass = String.valueOf(data2);
		//System.out.println("password is " + data2);

		int data3 = (int) sheet1.getRow(0).getCell(3).getNumericCellValue();
		String pass2 = String.valueOf(data3);
		//System.out.println("password is " + data3);

		String data4 = sheet1.getRow(0).getCell(4).getStringCellValue();
		//System.out.println("Full name " + data4);

		int data5 = (int) sheet1.getRow(0).getCell(5).getNumericCellValue();
		String number = String.valueOf(data5);
		//System.out.println("phone number " + data5);
		
		int data6 = (int) sheet1.getRow(0).getCell(6).getNumericCellValue();
		String age = String.valueOf(data6);
		//System.out.println("age " + data6);
		
		String data7 = sheet1.getRow(0).getCell(7).getStringCellValue();
		//System.out.println("company " + data7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver_win32/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://sam.rultest2.com");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("(//input[@name='login'])[2]")).sendKeys(data0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[1]/div/div/input")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[2]/div/div/input")).sendKeys(pass2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[3]/div/div/input")).sendKeys(data4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your phone number')]")).sendKeys("0"+ number);
		Thread.sleep(2000);
		
		WebElement ddown= driver.findElement(By.name("Gender"));
		Select select = new Select(ddown);
		select.selectByValue("male");
		
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[6]/div/div/input")).sendKeys(age);
		
		WebElement regddown= driver.findElement(By.name("Designation"));
		Select desigdown = new Select(regddown);
		desigdown.selectByValue("_others_");
		
		driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[8]/div/div/input")).sendKeys("RiseUp");
		
		//WebElement devddown= driver.findElement(By.name("Division"));
		//Select areaddown = new Select(devddown);
		//areaddown.selectByValue("_4");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[@class='select2-selection__placeholder'][contains(.,'Select District')]")).click();		
		//driver.findElement(By.xpath("//li[contains(.,'Brahmanbaria')]")).click();
		
//		Select areadisdown = new Select(distdown);
//		areadisdown.selectByValue("");
		
		driver.findElement(By.xpath("(//span[contains(.,'Register')])[2]")).click();
		
		driver.close();
		

	}
	
}
