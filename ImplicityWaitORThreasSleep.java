package taskNov07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWaitORThreasSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//IMPLICITLY WAIT USED(IT WILL WAIT & SEARCH ELEMENT)
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		
		driver.findElement(By.xpath("//div[@aria-label = 'bags for women']")).click();
		
		driver.findElement(By.xpath("(//i[@class = 'a-icon a-icon-checkbox'])[1]")).click();
		
		WebElement value = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
		String text = value.getText();
		
		System.out.println(text);
		
		
	}

}
