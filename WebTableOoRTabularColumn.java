package taskNov07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableOoRTabularColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("New Delhi",Keys.ENTER);
		
		driver.findElement(By.id("txtStationTo")).sendKeys("Mumbai Central",Keys.ENTER);
		
		String text = driver.findElement(By.xpath("(//div[@id='divTrainsList']//tr[4]//a)[1]")).getText();
		
		System.out.println(text);

	}

}
