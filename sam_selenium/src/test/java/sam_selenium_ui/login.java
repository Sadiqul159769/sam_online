package sam_selenium_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver_win32/chromedriver.exe");
		
		ChromeDriver login= new ChromeDriver();
		login.get("https://sam.rultest2.com");
		login.findElement(By.xpath("//a[contains(.,'Login')]")).click();
		login.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("pappu1");
		Thread.sleep(2000);
		login.findElement(By.xpath("(//input[contains(@name,'password')])[1]")).sendKeys("001234567890");
		Thread.sleep(2000);
		login.findElement(By.xpath("(//span[contains(.,'Login')])[2]")).click();
		Thread.sleep(5000);
		login.findElement(By.xpath("//a[contains(.,'Settings')]")).click();
		Thread.sleep(2000);
//		login.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("001234567890");
//		login.findElement(By.xpath("(//input[contains(@type,'password')])[2]")).sendKeys("001234567890");
//		login.findElement(By.xpath("(//span[contains(.,'Save changes')])[2]")).click();
//		Thread.sleep(5000);
		
//		login.findElement(By.xpath("//a[contains(.,'Login')]")).click();
//		login.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("pappu1");
//		Thread.sleep(2000);
//		login.findElement(By.xpath("(//input[contains(@name,'password')])[1]")).sendKeys("001234567890");
//		Thread.sleep(2000);
		
		login.findElement(By.xpath("(//a[contains(.,'Home')])[2]")).click();
		Thread.sleep(2000);
		login.findElement(By.xpath("(//a[contains(.,'My Course')])[2]")).click();
		Thread.sleep(2000);
		login.findElement(By.xpath("//a[contains(.,'Curriculum')]")).click();
		Thread.sleep(2000);
		login.findElement(By.xpath("//a[contains(.,'FAQ')]")).click();
		Thread.sleep(2000);
		login.findElement(By.xpath("(//a[contains(.,'Course')])[3]")).click();
		Thread.sleep(2000);
		login.findElement(By.xpath("//span[contains(.,'Start course')]")).click();
		Thread.sleep(2000);
		login.close();

	}

}
