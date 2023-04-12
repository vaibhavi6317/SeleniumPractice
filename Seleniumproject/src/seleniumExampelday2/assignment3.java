package seleniumExampelday2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	static WebDriver driver;
	public static void main(String[] args) {
			setup("chrome");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actual=driver.getTitle();
			String expected="Orangehrm";
			System.out.println("Validate page:"+actual.equals(expected));
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.className("oxd-button")).click();

	}
	private static void setup(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
			driver=new ChromeDriver();
}
}
}
/*Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page*/