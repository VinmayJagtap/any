package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver" , "C:\\SeleniumJars\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
		 // WebDriver driver1 = new FirefoxDriver();
		//open Browser
		driver.get("http://opensource-demo.orangehrmlive.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//get title
		
		System.out.println(driver.getTitle());
		String Expectedtitle = "OrangeHRM";
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String Actualtitle = driver.getTitle();
		
		if (Expectedtitle.equals(Actualtitle))
		{
			System.out.println("do logout");
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		}
		else
		{
			System.out.println("Expected is not equal to actual");
		}
		driver.close();//for 1 tab/browser to close
		//driver.quit();//for more than one tab to close
	}

}
