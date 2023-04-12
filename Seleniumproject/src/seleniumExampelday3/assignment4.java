package seleniumExampelday3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.techlistic.com");
	    
	    driver.manage().window().maximize();
	   // driver.manage().window().setSize(new Dimension(200,400));
	    //driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("JAVA")).click();
	    System.out.println("page Title:"+driver.getTitle());
	    driver.navigate().back();
	    
	     driver.findElement(By.linkText("API")).click();
	    System.out.println("page Title:"+driver.getTitle());
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("BDD")).click();
	    System.out.println("page Title:"+driver.getTitle());
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("TestNG")).click();
	    System.out.println("page Title:"+driver.getTitle());
	    driver.navigate().back();
	    
	    driver.close();
	    

	}

}
