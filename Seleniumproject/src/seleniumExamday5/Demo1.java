package seleniumExamday5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	
	public static void main(String[] args) {
	    
	    System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //	opean facebook
		driver.get("https://www.facebook.com/");
		//validate home page
		System.out.println(driver.getTitle());
		String act=driver.getTitle();
		String exp="Facebook – log in or sign up";
		System.out.println("Validate home page = " + act.equals(exp));
//		click on create account button
		WebElement createAcButton=driver.findElement(By.cssSelector("form[class='_9vtf']>div:nth-of-type(5)>a"));
		createAcButton.click();
		WebElement year=driver.findElement(By.id("year"));
//		visebal
		System.out.println("year is visibal =  " + year.isDisplayed());
//		enable
		System.out.println("year is enebal = " + year.isEnabled());
//		multiselect
		Select selectMonth=new Select(year);
		System.out.println("year is multiselected = " + selectMonth.isMultiple());
//		option count
		System.out.println("option count = " + selectMonth.getOptions().size());
//		name
		createAcButton=driver.findElement(By.cssSelector("div[id='reg_form_box']>*:nth-of-type(5)>div"));		
		System.out.println(createAcButton.getText());//Date of birth
//		default value
		System.out.println("Already selected = " + selectMonth.getFirstSelectedOption().getText());//
//		change value and check updated value
		selectMonth.selectByIndex(2);
	}

}
	    
	

	


