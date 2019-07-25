package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://elearning.upskills.in/");
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.name("submitAuth")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
		Thread.sleep(3000);
		//upload the file
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\VinmayJagtap\\Desktop\\Sheet.xlsx");
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("Execution is completed Successfully");
	}

}
