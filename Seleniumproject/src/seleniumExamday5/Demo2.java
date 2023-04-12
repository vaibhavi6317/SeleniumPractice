package seleniumExamday5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement monthDropdown=driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
		Select selectmonth=new Select(monthDropdown);
		System.out.println("Is dropdown is select multiple option: "+selectmonth.isMultiple());
		
		List ExpectedMonth=new ArrayList();
		ExpectedMonth.add("month");
		ExpectedMonth.add("january");
		ExpectedMonth.add("february");
		ExpectedMonth.add("march");
		ExpectedMonth.add("april");
		ExpectedMonth.add("may");
		ExpectedMonth.add("june");
		ExpectedMonth.add("july");
		ExpectedMonth.add("august");
		ExpectedMonth.add("september");
		ExpectedMonth.add("octobre");
		ExpectedMonth.add("november");
		ExpectedMonth.add("December");
		
		List<String>actualmonth=new ArrayList<String>();
		for(int i=0; i<selectmonth.getOptions().size();i++) {
			String ml=selectmonth.getOptions().get(i).getText();
			actualmonth.add(ml);
		}
		System.out.println(actualmonth.equals(ExpectedMonth));
		
	}

}
