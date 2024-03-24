package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {

	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Comsol\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	}

	@When("user enters username")
	public void user_enters_username() {
		WebElement username=driver.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys("hhh@gmail.com");
	   
	}

	@And("user enters password")
	public void user_enters_password() {
		WebElement pswrd=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		pswrd.sendKeys("12345");
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		WebElement butn=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		butn.click();
	    
	}

	@Then("user clicks the submit button and the login should be successfull")
	public void user_clicks_the_submit_button_and_the_login_should_be_successfull() {
		driver.quit();
	    
	}




}




