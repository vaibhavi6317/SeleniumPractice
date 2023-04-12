package seleniumExample;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Acclaration Class\\Workspace\\Seleniumproject\\Executables\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		System.out.println("Title "+driver.getTitle());
		String title=driver.getTitle();
		String axpectedtitle="https://demo.actitime.com/login.do";
		System.out.println(title.equals(axpectedtitle));
		System.out.println("Length "+title.length());
		System.out.println("page url "+driver.getCurrentUrl());
		System.out.println("page source :"+driver.getPageSource());
		String pagesource=driver.getPageSource();
		System.out.println("page source length :"+pagesource.length());
		driver.close();
	

	}

}
