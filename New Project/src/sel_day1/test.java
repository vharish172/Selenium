package sel_day1 ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement abc = driver.findElement(By.name("country"));
		Select obj = new Select(abc);
		
		obj.selectByVisibleText("IRAN");
		obj.selectByValue("GREECE");
		//obj.selectByIndex(3);
		// TODO Auto-generated method stub

	}

}
