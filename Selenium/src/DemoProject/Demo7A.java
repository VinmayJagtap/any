package DemoProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7A {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		/*String title1 = driver.getTitle();
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		String title2 = driver.getTitle();
		if(title1.contentEquals(title2)) {
			System.out.println("Titles are same");
		}
		else {
			System.out.println("Titles are not same");
		
		driver.close()};*/
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		
		//Switch to command is used to switch between the windows
		driver.switchTo().window(tabs.get(1));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.switchTo().window(tabs.get(0));
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title1.contentEquals(title2)) {
			System.out.println("Titles are same");
		}
		else {
			System.out.println("Titles are not same");
		
		driver.close();}

	}
}
