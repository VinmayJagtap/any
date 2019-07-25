package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 WebElement Link = driver.findElement(By.linkText("Car Rentals"));
		 
		 Actions act = new Actions(driver);
		 Action mouseover = act.moveToElement(Link).build();
		 mouseover.perform();
		 Thread.sleep(3000);
		 act.sendKeys(Link, (Keys.ENTER)).build().perform();
		 Thread.sleep(3000);
		 driver.close();
	}

}
