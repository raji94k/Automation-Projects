package loginID;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("dest")).sendKeys("Pondy");
			
			driver.findElement(By.id("src")).sendKeys("chennai");
			
			driver.findElement(By.linkText("search_btn")).click();

	}

}
