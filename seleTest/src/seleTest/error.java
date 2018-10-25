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

public class error {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://spimail.spi.com/");
		driver.findElement(By.id("username")).sendKeys("ABC");
		driver.findElement(By.id("password")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement errormsg=driver.findElement(By.xpath("//img[@title='Error']//following::td[text()='The username or password is incorrect. Verify that CAPS LOCK is not on, and then retype the current username and password.']"));

		//System.out.println(errormsg);		
		String colo=errormsg.getCssValue("color");
		String hex = Color.fromString(colo).asHex();
		
		System.out.println(hex);
		String black="#000000";
		if(black.equals(hex))
		{
			System.out.println("its a black color");
		}
		else
		{
			System.out.println("its not a black color");
		}
		
		Thread.sleep(1000);
		driver.close();
	}
	
	

}
