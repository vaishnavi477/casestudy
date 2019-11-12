package casestudy_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy3 {
	WebDriver driver;
	@Given("TestMeApp opened by User")
	public void testmeapp_opened_by_User() {
		System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
	    driver.get("http://localhost:8083/TestMeApp");	
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters username")
	public void user_enters_username() {
	   driver.findElement(By.id("userName")).sendKeys("Lalitha");
	}

	@Then("User enters password")
	public void user_enters_password() {
	    driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@Then("User presses Login button")
	public void user_presses_Login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("Login done succesfully")
	public void login_done_succesfully() {
		System.out.println("Login Successful");
	}

	@When("User points to All Categories")
	public void user_points_to_All_Categories() {
	    driver.findElement(By.linkText("All Categories")).click();
	}

	@When("User selects Electronics")
	public void user_selects_Electronics() {
	    driver.findElement(By.linkText("Electronics")).click();
	}
	@When("User selects Headphone")
	public void user_selects_Headphone() {
		driver.findElement(By.linkText("Head Phone")).click();
		/*Actions ac = new Actions(driver);
		WebElement element= driver.findElement(By.linkText("Travel Kit"));
		ac.doubleClick(element);*/
	}
	@Then("User searches for HeadPhone")
	public void user_searches_for_HeadPhone() {
		driver.findElement(By.xpath("//input[@id='pname']")).sendKeys("Head");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User adds HeadPhone to cart")
	public void user_adds_HeadPhone_to_cart() {
	    driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-shopping-cart']")).click();
	}

	@Then("User clicks on cart")
	public void user_clicks_on_cart() {
	    driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
	}

	@Then("User clicks on checkout")
	public void user_clicks_on_checkout() {
	    driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
	}
	
	@Then("Appliance bought")
	public void appliance_bought() {
		System.out.println("Head Phones bought");
		//driver.close();
	}


}