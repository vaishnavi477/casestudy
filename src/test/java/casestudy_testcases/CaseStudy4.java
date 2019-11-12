package casestudy_testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CaseStudy4 {
	WebDriver driver;
	@Given("User registered in TestMeApp")
	public void user_registered_in_TestMeApp() {
		System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
	    driver.get("http://localhost:8083/TestMeApp");	
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}

	@When("User search a particular product")
	public void user_search_a_particular_product() {
		driver.findElement(By.linkText("All Categories")).click();
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.linkText("Head Phone")).click();
		driver.findElement(By.xpath("//input[@id='pname']")).sendKeys("Head");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	   Assert.assertFalse(driver.getTitle().contains("View Cart"));
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
	    System.out.println("No product in the cart");
	    driver.close();
	}


}

	
