package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("User is on newtours website")
	public void user_is_on_newtours_website() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	}

	@When("User enter {string} and {string} correctly")
	public void user_enter_and_correctly(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("login")).click();
	}

	@Then("Logged in successfully")
	public void logged_in_successfully() {
		System.out.println("User logged in successfully");
	}

}
