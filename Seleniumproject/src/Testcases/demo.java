package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// driver.get("ChromeDriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement Password = driver.findElement(By.cssSelector("input[class=\"textField pwdfield\"]"));
		Password.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		// select create task
		driver.findElement(By.xpath(
				"//td[@class=\"navItem preventPanelsHiding navCell relative notSelected\"]/a[@class='content tasks']/div[2]"))
				.click();
		// add new task
		driver.findElement(By.xpath("//div[@class='addNewContainer']/div[@class='addNewButton']/div[3]")).click();
		// click on new task
		driver.findElement(By.xpath("//div[@class='dropdownContainer addNewMenu']/div[3]")).click();
		//add costmor
		
        driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[1]/div")).click();
      //add project name
      	driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[1]/div[3]")).click();
      	//enter name
       driver.findElement(By.cssSelector("input[class=inputFieldWithPlaceholder")).sendKeys("Ashwini Ghule");
      	//select check box
       driver.findElement(By.xpath("//td[@class='addToTTCell']/label[@class='components_checkboxContainer checkboxContainer']/span[2]")).click();
      	//click to create task
      	driver.findElement(By.xpath("//div[@class='buttonsBox']//div[@class='commitButtonPlaceHolder']/div[@class='components_button withPlusIcon']/div[@class='components_button_label']")).click();

	}

}
