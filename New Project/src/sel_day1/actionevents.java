package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionevents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
        Actions obj = new Actions(driver);
        
        WebElement elem = driver.findElement(By.name("firstName"));
        
        obj.keyDown(elem,Keys.SHIFT)
           .sendKeys("amit")
           .sendKeys(Keys.BACK_SPACE)   
           .keyUp(Keys.SHIFT)
           .sendKeys(Keys.chord("am"))
           .build().perform();
		
		
		//Mouse events
		
       /* driver.get("https://jqueryui.com/droppable/");
		
        Actions obj = new Actions(driver);
        WebElement frameexam = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameexam);
        
        WebElement elem = driver.findElement(By.id("draggable"));
        WebElement objfordrop = driver.findElement(By.id("droppable"));
        
       // obj.clickAndHold(elem).moveToElement(objfordrop).release().build().perform();
        
        obj.dragAndDrop(elem, objfordrop).contextClick(objfordrop).build().perform();*/
        
	/*	driver.get("https://demo.guru99.com/test/newtours/register.php");
		Actions obj = new Actions(driver);
		WebElement home = driver.findElement(By.linkText("Home"));
		obj.moveToElement(home).click().build().perform();
		Actions obj1 = new Actions(driver);
		WebElement submit1 = driver.findElement(By.name("userName"));
		WebElement e2 = driver.findElement(By.name("password"));
		
		obj1.moveToElement(submit1).click().build().perform();*/
		
        
        

	}

	private static Actions build() {
		// TODO Auto-generated method stub
		return null;
	}

}
