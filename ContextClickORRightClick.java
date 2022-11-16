package taskNov10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickORRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		//driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions builder=new Actions(driver);
		
		WebElement wishListEle = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		
		WebElement accountsElement = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span"));
		
		builder.moveToElement(accountsElement).perform();
		
		wishListEle.click();
	
		builder.contextClick().perform();  //right click
		
		//Point location = accountsElement.getLocation();
		
		//System.out.println(location);

	}

}
