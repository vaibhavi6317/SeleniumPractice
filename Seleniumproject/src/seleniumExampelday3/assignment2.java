package seleniumExampelday3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	  //username
	    WebElement userNameInputField=driver.findElement(By.className("oxd-input"));
	    System.out.println("User name input field visible or not?"+userNameInputField.isDisplayed());
	    System.out.println("User name input field editable or not?"+userNameInputField.isEnabled());
	    String userNameInputFieldValue=userNameInputField.getAttribute("placeholder");
	    System.out.println("Default value validation status:"+userNameInputFieldValue.equals("User Name"));
	    
	    //password
	    WebElement passwordInputField=driver.findElement(By.className("oxd-input"));
	    System.out.println("Password input field visible or not?"+passwordInputField.isDisplayed());
	    System.out.println("Password input field editable or not?"+passwordInputField.isEnabled());
	    String passwordInputFieldValue=passwordInputField.getAttribute("placeholder");
	    System.out.println("Default value validation status:"+passwordInputFieldValue.equals("Password"));
	    
	    //login button
	    WebElement idloginbutton=driver.findElement(By.className("oxd-button"));
	    System.out.println("Login button input field visible or not?"+idloginbutton.isDisplayed());
	    System.out.println("Login button input field editable or not?"+idloginbutton.isEnabled());
	    String actualButtonName=idloginbutton.getText().trim();
	    System.out.println("Login button name validation status?"+actualButtonName.equals("Login"));

	}

}
