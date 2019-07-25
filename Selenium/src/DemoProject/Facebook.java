package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("8796380454");
		driver.findElement(By.id("pass")).sendKeys("Aku@1994");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(10000);
		 
		driver.findElement(By.xpath("(//*[@class='_2n_9'])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),\"Mrunmayee Mokashi\")])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hi Madam, Good Night");
		
		driver.findElement(By.xpath("//a[@class='_6gb _6wm4 _6987']//*[@class='svgIcon']")).click();
		
		
	}

}
