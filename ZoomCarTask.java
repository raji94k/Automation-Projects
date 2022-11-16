package taskNov06;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCarTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new  ChromeOptions();
		 options.addArguments("--disable-notifications");
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoomcar.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='multiselect__select'])[1]")).click();
		
		//driver.findElement(By.xpath("//div[@class='city_list__wrapper--multiselect']/div")).sendKeys("chennai");
		
		//driver.findElement(By.xpath("//button[@class='city-lightbox__confirm-button']")).click();
		
		//driver.findElement(By.xpath("(//div[@class='tab-content'])[2]")).click();

	}

}
