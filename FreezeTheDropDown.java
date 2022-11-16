package taskNov07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreezeTheDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.zoomcar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//div[@class='multiselect__select'])[1]")).click();
		
		//setTimeout(function(){debugger;},5000); (INSPECT la poi CONSOLE select)
		
		driver.findElement(By.xpath("(//span[@class='dropdown-item__title'])[3]")).click();
		
		
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).click();
		
		driver.findElement(By.xpath("(//li[@class='multiselect__element'])[9]")).click();

	}

}
