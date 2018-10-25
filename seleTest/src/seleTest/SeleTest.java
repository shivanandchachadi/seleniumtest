package seleTest;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;



public class SeleTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement image=driver.findElement(By.xpath("//img[@alt='Google'][@id='hplogo']"));
		String name=image.getTagName();
		System.out.println(name);
		String actualname="img";
		
	if(name.equals(actualname))
	{
		System.out.println("its an image");
	}
	else
	{
		System.out.println("its not an image");
	}
	
	
	Thread.sleep(5000);
	
	driver.close();
	}

	

	
	
	

}
