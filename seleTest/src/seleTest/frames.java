package seleTest;

//import java.awt.Dimension;
//import java.util.concurrent.TimeUnit;

//import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.Wait;

public class frames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Training/AppData/Local/Temp/Temp1_New%20folder.zip/New%20folder/Set%20I%20-%20Q.3b/Page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("Protactor");
		Thread.sleep(2000);	
		
		
		driver.close();
	}
	
	

}
