package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/tasks/tasklist.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualTitle=driver.getTitle();
		System.out.println("actualtitle:"+actualTitle);
		String expectedTitle="actutime";
		System.out.println("validate the title:"+actualTitle.equals(expectedTitle));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();//addnew
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();//newtask
		driver.findElement(By.xpath("//div[@class='itemRow cpItemRow']")).click();//select
		driver.findElement(By.xpath("//*[@id=\\\"createTasksPopup_content\\\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[1]/div")).click();
		driver.findElement(By.xpath("//div[@class='typeOfWorkButton editable']/div")).click();
	}

}
