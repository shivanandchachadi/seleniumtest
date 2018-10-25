package seleTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.Action;

//import java.awt.Dimension;
//import java.util.concurrent.TimeUnit;

//import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.Wait;

public class file {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "./iedriver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/table[1]/tbody/tr[1]/td[4]/a")).click();
		Robot obj=new Robot();
		obj.keyPress(KeyEvent.VK_ALT);
		obj.keyPress(KeyEvent.VK_S);		
		obj.keyPress(KeyEvent.VK_ALT);
		obj.keyPress(KeyEvent.VK_S);
		obj.keyPress(KeyEvent.VK_ENTER);
		//driver.close();
		
	}
	
	

}
