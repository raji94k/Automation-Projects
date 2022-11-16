package taskNov3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAmazonPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("split ac");
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        driver.findElement(By.xpath("(//i[@class = 'a-icon a-icon-checkbox'])[5]")).click();
        
         WebElement value = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']"));
        String text = value.getText();
        
        System.out.println(text);
    
	}

}
