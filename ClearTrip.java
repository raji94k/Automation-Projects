package taskNov6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new  ChromeOptions();
		 options.addArguments("--disable-notifications");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.zoomcar.com/in/bangalore");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
			
			//driver.findElement(By.xpath("(//div[@class='p-relative'])[1]")).click();
			
			//driver.findElement(By.className("flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-secondary-500 c-pointer c-neutral-900")).click();
			
			//driver.findElement(By.className("field-1 flex flex-middle p-relative pr-4 w-100p ")).sendKeys("chennai");

	}

}
