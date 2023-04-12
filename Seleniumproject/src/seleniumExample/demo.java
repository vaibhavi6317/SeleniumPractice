package seleniumExample;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Executables\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
    		 System.out.println("Home page Title :"+driver.getTitle());
    		 driver.close();
	}

}
