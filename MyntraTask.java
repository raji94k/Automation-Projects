package taskNov3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/shop/men");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
       driver.findElement(By.className("desktop-searchBar")).sendKeys("shirt",Keys.ENTER);	
       
       driver.findElement(By.xpath("//div[@class='filter-search-filterSearchBox']/span")).click();
       
       driver.findElement(By.xpath("//input[@class='filter-search-inputBox']")).sendKeys("u.s");
       
       driver.findElement(By.xpath("//input[@value='U.S. Polo Assn. Kids']/following-sibling::div")).click();
       
       driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
       
       //driver.findElement(By.xpath("")).click();
	}

}
