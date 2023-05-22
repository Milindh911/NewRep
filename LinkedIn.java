package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LinkedIn 
{
	WebDriver driver = null;
	String url = "https://in.linkedin.com/";
	
	@Given("^LinkedIn is open$")
	public void linkedin_is_open() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/MI20463606/Downloads/chromedriver_mac_arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	}

	@And("^User can navigate to signup for linkedin$")
	public void user_can_navigate_to_signup_for_linkedin() throws InterruptedException 
	{
		WebElement signup = driver.findElement(By.xpath("//a[@class='sign-in-form__join-cta btn-md btn-secondary w-column babybear:w-full block mb-3']"));
		signup.click();
		Thread.sleep(2000);
	}

	@When("^User enters email id and enters password$")
	public void user_enters_email_id_and_enters_password() throws InterruptedException 
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='email-or-phone']"));
		username.click();
		username.sendKeys("milindhr.kashyap@wipro.com");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("P@$$w0rd");
		Thread.sleep(2000);
	}

	@When("^user is navigated$")
	public void user_is_navigated() throws InterruptedException 
	{
		WebElement signin = driver.findElement(By.xpath("//button[@id='join-form-submit']"));
		signin.click();
		Thread.sleep(5000);
		System.out.println("Mili");
		driver.close();
	}
	
}
