package seleniumExampelday4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement>nameList=driver.findElements(By.cssSelector("div[class='makers']>ul>li>a>img"));
	System.out.println("Samsung mobile list: "+nameList.size());
	for(int i=0; i<nameList.size();i++) {
		WebElement mobilename=nameList.get(i);
		System.out.println("mobilename"+i+": "+mobilename.getText());
	}
	}
}
