package seleniumExamday5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement yearDropdown=driver.findElement(By.id("yearbox"));
		Select selectyear=new Select(yearDropdown);
		System.out.println("Is dropdown is  select multiple option: "+selectyear.isMultiple());
		
		Select YearDrop = new Select(driver.findElementById("yearbox"));
		List<Integer> year = new ArrayList<Integer>();
		for(int i = 1; i<YearDrop.getOptions().size();i++) {
			String years=YearDrop.getOptions().get(i).getText();
			year.add(Integer.parseInt(years));
	}
		List<Integer>dupyear=new ArrayList<Integer>(year);
		Collections.sort(dupyear);
		System.out.println(year.equals(dupyear));
	}

}
