
package taskNov07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionORScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		WebElement mobile = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[32]"));
		
		Actions builder = new Actions(driver);
		builder.scrollToElement(mobile).perform();
		
        driver.findElement(By.id("(//i[@class='a-icon a-icon-checkbox'])[147]")).click();
	}

}
