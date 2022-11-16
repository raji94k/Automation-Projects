package taskNov2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTask {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@aria-label = 'bags for women']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//i[@class = 'a-icon a-icon-checkbox'])[1]")).click();
			
			WebElement value = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
			String text = value.getText();
			
			System.out.println(text);
			
	}

}
