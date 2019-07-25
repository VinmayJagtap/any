package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		WebElement link = driver.findElement(By.id("menu-catalog"));
		act.moveToElement(link).click().build().perform();
	}

}
