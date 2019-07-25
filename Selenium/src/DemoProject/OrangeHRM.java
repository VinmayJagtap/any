package DemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu__Performance")).click();
		driver.findElement(By.linkText("Performance")).click();
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("There are "+allLinks.size()+"Links in the page");
		
		for (WebElement link:allLinks) {
		
		System.out.println(link.getText()+"    "+link.getAttribute("href"));
		System.out.println();
		
		driver.close();
		}
	}

}
