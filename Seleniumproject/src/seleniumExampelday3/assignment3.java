package seleniumExampelday3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    //Thread.sleep(2000);
		    driver.manage().window().setSize(new Dimension(300,500));
		    driver.manage().window().maximize();
		    System.out.println("page title:"+driver.getTitle());
		    driver.findElement(By.linkText("Amazon Pay")).click();
		    driver.navigate().back();
		    String Expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		    WebDriverWait wait=new WebDriverWait(driver,7);
		    String actualTitle=driver.getTitle().trim();
		    System.out.println("verify the Title :"+actualTitle.equals(Expectedtitle));
		    driver.close();

	}

}
