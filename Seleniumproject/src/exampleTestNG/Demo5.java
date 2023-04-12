package exampleTestNG;

import org.testng.annotations.Test;

public class Demo5 {
  @Test(priority=1,enabled=true,description="Here user has to signin before login")
  public void signin() {
	  System.out.println("signIn");
  }
  @Test(priority=2,enabled=true,invocationCount=5)
  public void login() {
	  System.out.println("login");
  }
  @Test(timeOut=2000)
  public void compose() throws InterruptedException {
	  System.out.println("started");
		Thread.sleep(3000);
	  System.out.println("Ends");
  }
    
}
