package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.className("oxd-button")).click();
	    
	    driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div[class='orangehrm-paper-container']>div>*:first-child")).click();
	    driver.findElement(By.name("firstName")).sendKeys("vaibhavi");
	    driver.findElement(By.name("lastName")).sendKeys("Patil");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
	}

}
 
