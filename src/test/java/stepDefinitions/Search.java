package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;

public class Search {
	
	public WebDriver driver; 
	
	@Given("USer is on GrenKart Landing page")
	public void user_is_on_GrenKart_Landing_page() throws IOException {
	    
		System.out.println("Initialize chrome driver and launch URL");
		driver = DriverFactory.openBrowser("chrome");
	}

	  @When("^User searched for (.+) Vegetable$")
	    public void user_searched_for_something_vegetable(String strArg1) throws InterruptedException {
	      
		  System.out.println(strArg1);
		  WebElement element = driver.findElement(By.xpath("//input[@type='search']"));
		  element.sendKeys(strArg1);
		  Thread.sleep(3000);
	   
	}

	  @Then("^(.+) Vegetable results are Displayed.$")
	    public void something_vegetable_results_are_displayed(String strArg1) throws InterruptedException {
	    Assert.assertTrue(this.driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	    Thread.sleep(3000);
	}
	  
	  @And("^User add the items to cart$")
	    public void user_add_the_items_to_cart() throws Throwable {
	        driver.findElement(By.cssSelector("a.increment")).click();
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
	        Thread.sleep(3000);
	    }

	    @And("^User proceed to check out the searched items$")
	    public void user_proceed_to_check_out_the_searched_items() throws Throwable {
	        driver.findElement(By.cssSelector("span.cart-count"));
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
	        Thread.sleep(3000);
	    }

	    @And("^Verify if the (.+) was present in checkout page$")
	    public void verify_if_the_something_was_present_in_checkout_page(String strArg1) throws Throwable {
	    	       
	        Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
	        Thread.sleep(3000);
	        
	    }
}
