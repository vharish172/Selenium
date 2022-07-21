package sel_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.linkText("create a page")).click();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
		driver.quit();*/
		
		/*driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();*/
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("usernamee");
		driver.findElement(By.id("pass")).sendKeys("passwordd");
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();*/
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harish");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Veeraragavan");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+91 7639509298");
		driver.findElement(By.xpath("//input[@size='35']")).sendKeys("harish172@gmail.com");
		
		driver.findElement(By.xpath("//input[@size='40']")).sendKeys("456");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harish172");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
