package seleTest;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;

public class dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Scanner scan=new Scanner(System.in);
	//	System.out.println("please enter the options");
		//String sc=scan.nextLine();
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Training/AppData/Local/Temp/Temp1_New%20folder.zip/New%20folder/Set%20I%20-%20Q%205b/5.%20b.html");
		WebElement bowl=driver.findElement(By.id("dev"));
		Select obj=new Select(bowl);
		obj.selectByIndex(1);	
		System.out.println();
	
		obj.selectByValue("p");
		
		obj.selectByVisibleText("Ruby");
		
		List<WebElement>list1=obj.getAllSelectedOptions();
		System.out.println("selected options are "+list1.size());
		
		WebElement p=obj.getFirstSelectedOption();
		System.out.println(p.getText());
		
		
		List<WebElement> list=obj.getOptions();
		
		System.out.println("number of options are " + list.size());
		boolean sel=obj.isMultiple();
		System.out.println(sel);
//		if(obj.isMultiple())
//		{
//			obj.deselectByIndex(1);
//			obj.deselectByVisibleText("Ruby");
//			obj.deselectAll();
//		}

		Select test= new Select(driver.findElement(By.id("test")));
		List<WebElement>t=test.getOptions();
		System.out.println("options in test dropdown are"+t.size());
		List<String> text = new ArrayList<>();
		for(int i=1; i<t.size(); i++) {
		    System.out.println(t.get(i).getText());
		}
	
	
		
		driver.close();
	}
	
	

}
