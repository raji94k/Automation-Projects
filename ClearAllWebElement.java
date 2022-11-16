package task31oct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearAllWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://in.bookmyshow.com/buytickets/prince-chennai/movie-chen-ET00331045-MT/20221101");
			
			WebElement Text = driver.findElement(By.name("inputSearchBox"));
			
			Text.sendKeys("prince",Keys.ENTER);
			
			Thread.sleep(1000);
			
			Text.clear();
			
	}

}
