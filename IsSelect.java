package task31oct;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelect {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss");
			
			driver.findElement(By.id("a-icon a-icon-checkbox")).isSelected();

	}

}
