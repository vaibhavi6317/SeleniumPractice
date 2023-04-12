package exampleTestNG;

import org.testng.annotations.Test;

public class Demo4 {
  @Test(priority=1,enabled=false)
  public void signin() {
	  System.out.println("signin");
  }
  
  @Test(enabled=true)
  public void login() {
	  System.out.println("login");
  }
  
  @Test(priority=3)
  public void composeMail() {
	  System.out.println("composeMail");
  }
  
  @Test(priority=4)
  public void checkSentItems() {
	  System.out.println("checkSentItems");
  }
}
