package casestudy_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy2 {
	WebDriver driver;
	@Given("User opens TestMeApp")
	public void user_opens_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://localhost:8083/TestMeApp");	
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
	    driver.findElement(By.id("userName")).sendKeys(username);
	}

	@Then("User enters password as {string}")
	public void user_enters_password_as(String password) {
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("User clicks on Login button")
	public void user_clicks_on_Login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("Login Successful")
	public void login_Successful() {
	    System.out.println("Login Successful");
	    
	}


}
