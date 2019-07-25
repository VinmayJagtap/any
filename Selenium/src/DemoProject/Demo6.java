package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		Actions Act = new Actions(driver);
		Act.sendKeys(login,(Keys.ENTER)).build().perform();
		Action mouseover = Act.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).build();
		mouseover.perform();
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Act.sendKeys(Keys.ARROW_DOWN).build().perform();;
		Act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		System.out.println("completed");
		
		/*
		 * Act.sendKeys(Keys.TAB).build().perform();
		 * Act.sendKeys(Keys.TAB).build().perform();
		 * Act.sendKeys(Keys.TAB).build().perform();
		 * Act.sendKeys(Keys.ENTER).build().perform(); driver.navigate().back();
		 * 
		 * Act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		 */
		
		
	}

}
