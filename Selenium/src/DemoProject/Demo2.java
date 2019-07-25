package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 //driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sunil");
		 
		 WebElement UN= driver.findElement(By.xpath("//input[@name='userName']"));
		 
		 if (UN.isEnabled()){
			 UN.sendKeys("sunil");
			 Thread.sleep(3000);
			 UN.clear();
			 Thread.sleep(3000);
			 UN.sendKeys("sunil");
			 Thread.sleep(3000);
		 }
		 
		 if (driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed()) {
			 
			 //Get attribute name in single line
			//System.out.println(UN.getAttribute("value")); 
			 
			 //get attribute name is 2 lines by defining the string
			 String name = UN.getAttribute("value");
			 System.out.println("This will print the Username value in attribute "+name);
			 
			 String name1 = UN.getAttribute("name");
			 System.out.println("This will print the name of the attribute "+name1);
			 
			 driver.findElement(By.name(name1)).clear();
			 
			 String size = UN.getAttribute("size");
			 System.out.println("value of the attribute size is "+size);
			 
			 //Gettext can be used for labels and for list as well
			 String UNtext = driver.findElement(By.xpath("//font[contains(text(),'Name:')]")).getText();
			 System.out.println(UNtext);
			 
			String Passtext = driver.findElement(By.xpath("//font[contains(text(),'Password:')]")).getText();
			System.out.println(Passtext);
			 
			
		 }
		 	
		/*
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sunil");
		 * 
		 * driver.findElement(By.xpath("//input[@name='login']")).click();
		 */ 
		  driver.close();
		 
		

	}

}
