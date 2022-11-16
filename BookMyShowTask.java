package task31oct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShowTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://in.bookmyshow.com/buytickets/prince-chennai/movie-chen-ET00331045-MT/20221101");
			
			driver.findElement(By.name("inputSearchBox")).sendKeys("prince",Keys.ENTER);
			
	}

}
