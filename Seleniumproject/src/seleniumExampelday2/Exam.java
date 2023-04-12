package seleniumExampelday2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Exam {
	static WebDriver driver;
	public static void main(String[] args) {
		setup("chrome");
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		System.out.println("actualtitle:"+actualTitle);
		String expectedTitle="Swag Labs";
		System.out.println("validate the title:"+actualTitle.equals(expectedTitle));
		/*driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("login_password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		/*driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		/*driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

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
	


