package seleniumExampelday4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class assignment2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> nameList=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
		System.out.println("Total mobile name List: "+nameList.size());
		for(int i=0; i<nameList.size();i++) {
			WebElement mobilename=nameList.get(i);
			System.out.println("mobilename"+i+": "+mobilename.getText());
			}
	}
}
