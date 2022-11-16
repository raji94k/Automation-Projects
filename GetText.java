package task31oct;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://in.bookmyshow.com/buytickets/prince-chennai/movie-chen-ET00331045-MT/2022110");
			
			String text = driver.findElement(By.id("spnSelectedRegion")).getText();
			
			System.out.println(text);
			

	}

}
