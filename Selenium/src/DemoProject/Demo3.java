package DemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		WebElement RTCTA = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		if(RTCTA.isEnabled())
		{driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Thread.sleep(1000);}
		

		WebElement DD1 = driver.findElement(By.xpath("//select[@name='passCount']"));
		Select sel= new Select(DD1);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		
		for(int i=0; i<data.size();i++) 
		{
			System.out.println(data.get(i).getText());
		}
		
		//1st option
		sel.selectByVisibleText("2");
		Thread.sleep(2000);
		//2nd option
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//3rd option
		sel.selectByValue("1");
		Thread.sleep(2000);
		
		
		
		//WebElement DD2 = driver.findElement(By.className("fromPort"));
		
		/*
		 * Select sel2 = new Select(DD2); sel2.selectByValue("Frankfurt");
		 * Thread.sleep(3000);
		 */
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("ABCD");
		driver.findElement(By.name("passLast0")).sendKeys("XYZ");
		
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890123456");
		
		//driver.findElement(By.xpath("//input[@name='ticketLess'] /following-sibling::font[contains(text(),'Ticketless Travel')]")).click();
		
		//driver.findElement(By.xpath("//input[@name='ticketLess'] /following-sibling::font[contains(text(),'Same as Billing Address')]")).click();
		
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		
		for(WebElement e:checkbox)
		{
			e.click();
		}
		Thread.sleep(3000);
		for(int i=1; i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		Thread.sleep(3000);
		for (int i=0; i<checkbox.size()-1;i++) {
			checkbox.get(i).click();}
		Thread.sleep(3000);
		driver.close();
		System.out.println("Execution is Completed Successfully");
	}

}
