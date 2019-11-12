package casestudy_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 {
	WebDriver driver;
	
	@Given("User opens the TestMeApp")
	public void user_opens_the_TestMeApp() {
	    System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://localhost:8083/TestMeApp");	
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignUp")).click();
	}
	
	@When("user enters user name")
	public void user_enters_user_name() {
	    driver.findElement(By.id("userName")).sendKeys("VaishPatil");
	}
	@When("User enters first name")
	public void user_enters_first_name() {
	    driver.findElement(By.id("firstName")).sendKeys("Vaishnavi");
	}

	@When("User enters last name")
	public void user_enters_last_name() {
	   driver.findElement(By.name("lastName")).sendKeys("Patil");
	}

	@When("User enters password to signin")
	public void user_enters_password_to_signin() {
	    driver.findElement(By.id("password")).sendKeys("vaish123");
	}

	@Then("User confirms the password entered")
	public void user_confirms_the_password_entered() {
	    driver.findElement(By.id("pass_confirmation")).sendKeys("vaish123");
	}

	@Then("User selects Gender")
	public void user_selects_Gender() {
	    driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Then("User Enters his mail id")
	public void user_Enters_his_mail_id() {
	 driver.findElement(By.name("emailAddress")).sendKeys("vaishnavigpatil@gmail.com");
	}

	@Then("User enters Contact number")
	public void user_enters_Contact_number() {
	    driver.findElement(By.id("mobileNumber")).sendKeys("9404785216");
	}

	@Then("User selects date of birth")
	public void user_selects_date_of_birth() {
	    driver.findElement(By.xpath("//input[@data-validation='required birthdate']")).sendKeys("19/10/1997");
	}

	@Then("User enters address")
	public void user_enters_address() {
	    driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Savarkar Nagar,Nashik");
	}

	@Then("User choses a security question")
	public void user_choses_a_security_question() {
	    driver.findElement(By.name("securityQuestion")).click();
	    driver.findElement(By.xpath("//option[@value='411011']")).click();
	}

	@Then("User answers the security question")
	public void user_answers_the_security_question() {
	 driver.findElement(By.id("answer")).sendKeys("blue");
	}

	@Then("User clicks on Register button")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("Registration successful")
	public void registration_successful() {
	   System.out.println("Success");
	   driver.close();
	}



}
