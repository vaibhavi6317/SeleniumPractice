package seleniumExampelday4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement>mobileList=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h4>a"));
		List<WebElement>mobileprice=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h5"));
		System.out.println("Total mobile name list:"+mobileList.size());
		
		for(int i=0;i<mobileList.size();i++) {
			WebElement mobile=mobileList.get(i);
			WebElement mobilePrice=mobileprice.get(i);
			//System.out.println("Mobile name"+i+": "+mobile.getText());
			System.out.println("name and price"+i+": "+mobile.getText()+"paice "+mobilePrice.getText());
		}
		

	}

}
