import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://sam.rultest2.com");

	}

}