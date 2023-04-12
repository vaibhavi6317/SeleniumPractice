package seleniumExampelday4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		setup("chrom","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userNameText=driver.findElement(By.cssSelector("#app>div>p:nth-of-type(1)"));
		String userNameWithLabel=userNameText.getText();
		String userName=userNameWithLabel.replace("Username: ","");
		
		WebElement passwordText=driver.findElement(By.cssSelector("#app>div>p:nth-of-type(2)"));
		String passwordWithLabel=passwordText.getText();
		String[] password=passwordWithLabel.split(" ");
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password[1]);
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	}
	
		
	private static void setup(String browserName, String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(appUrl);
	
	}
}
