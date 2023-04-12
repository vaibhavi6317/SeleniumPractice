package seleniumExampelday2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class assignment2 {
	static WebDriver driver;
	public static void main(String[] args) {
		setup("chrome");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		String actualTitle=driver.getTitle();
		System.out.println("actualtitle:"+actualTitle);
		String expectedTitle="vtiger";
		System.out.println("validate the title:"+actualTitle.equals(expectedTitle));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.className("button")).click();

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
/*open a chrome browser
enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button
*/