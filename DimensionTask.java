package taskNov2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DimensionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
		
			//Dimension d = new Dimension(400,400);
			//driver.manage().window().setSize(d);
			
			driver.navigate().to("https://www.redbus.in/");
			
			

	}

}
