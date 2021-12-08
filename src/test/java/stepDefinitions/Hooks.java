package stepDefinitions;

import io.cucumber.java.After;
import utilities.DriverFactory;

public class Hooks extends DriverFactory {

	
	@After("@TC")
	public void teardown()
	{
		driver.close();
		
	}
}
