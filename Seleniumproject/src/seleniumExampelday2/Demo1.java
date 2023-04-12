package seleniumExampelday2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 {
	static WebDriver driver;
	public static void main(String[] args) {
		setup("chrome");
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	String pageTitle=driver.getTitle();
	System.out.println("current page Titel:"+pageTitle);
	System.out.println("Title length:"+pageTitle.length());
	System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.name("UserName")).sendKeys("execution");
	    driver.findElement(By.name("Password")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[name='Login']")).click();
	    System.out.println("page Title:"+driver.getTitle());
	    System.out.println("URL:"+driver.getCurrentUrl());
	   // driver.close();   
	}

	private static void setup(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}

}
