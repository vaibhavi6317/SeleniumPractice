package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
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
		
		driver.findElement(By.xpath("//div[@class='row app-navigator']")).click();
		driver.findElement(By.xpath("//div[@class='menu-items-wrapper app-menu-items-wrapper']")).click();
        driver.findElement(By.cssSelector("ul[class='dropdown-menu app-modules-dropdown mCustomScrollbar _mCS_1 mCS_no_scrollbar']>div>div>li>*:first-child")).click();
        
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[1]//button[@id='Campaigns_listView_basicAction_LBL_ADD_RECORD']")).click();//add campain
        driver.findElement(By.xpath("//table[@class='table table-borderless']//tbody//tr//td[2]//input[@id='Campaigns_editView_fieldName_campaignname']")).sendKeys("Tester");
       driver.findElement(By.xpath("//table[@class='table table-borderless']//tbody/tr//td[4]")).click();
       driver.findElement(By.cssSelector("div[class='oxd-table-cell-actions']>*:last-child")).click();
       
	}

}
