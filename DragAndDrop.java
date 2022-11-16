package taskNov10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");

		//driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		
		Actions builder=new Actions(driver);
		
		WebElement source = driver.findElement(By.id("(//div[@id='div1'])"));
		
		WebElement destination = driver.findElement(By.id("//img[@id='drag1']"));
		
		builder.dragAndDrop(source, destination).perform();
	}

}
