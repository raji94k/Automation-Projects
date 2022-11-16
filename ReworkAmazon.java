package taskNov3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReworkAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("split ac");
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        driver.findElement(By.xpath("(//i[@class = 'a-icon a-icon-checkbox'])[7]")).click();
        
        driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small a-text-right']")).click();
        
	}

}
