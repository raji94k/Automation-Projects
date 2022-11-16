package loginID;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginID {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("raj");
			driver.findElement(By.id("pass")).sendKeys("raji");
			
	}

}
