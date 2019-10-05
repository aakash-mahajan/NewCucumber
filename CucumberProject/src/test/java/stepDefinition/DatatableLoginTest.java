package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableLoginTest {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	}

	@When("User Enter Credentials")
	public void user_Enter_Credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<String> list = dataTable.asList();
		for(int i=0;i<list.size();i++)
		{
			driver.findElement(By.name("userName")).sendKeys(list.get(i));
		    driver.findElement(By.name("password")).sendKeys(list.get(i+1));
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(5000);
		}
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("User logged in successfully");
	}
}
