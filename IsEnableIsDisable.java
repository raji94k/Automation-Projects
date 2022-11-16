package task31oct;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnableIsDisable {

	public static void main(String[] args) {
	       
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://in.bookmyshow.com/buytickets/sardar-pondicherry/movie-pond-ET00310546-MT/20221101#!seatlayout");
			
			driver.findElement(By.id("javascript:;")).isEnabled();
			

	}

}
