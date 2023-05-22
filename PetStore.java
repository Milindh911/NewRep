package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PetStore 
{
	public static WebDriver driver ;
	String BaseUrl = "https://petstore.octoperf.com/actions/Catalog.action";
	
	@Given("^The application is accessible$")
	public void the_application_is_accessible() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/MI20463606/Downloads/chromedriver_mac_arm64/chromedriver");
		driver = new ChromeDriver();
		driver.get(BaseUrl);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	}

	@And("^The user clicks on the the signin button$")
	public void the_user_clicks_on_the_the_signin_button() throws InterruptedException 
	{
		WebElement signin = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		signin.click();
		driver.getTitle();
		
		
		
	}

	@When("^The user is redirected to the sign in page$")
	public void the_user_is_redirected_to_the_sign_in_page() 
	{
		System.out.println("Redirected to signin page");
	}

	@And("^the user enters the valid credentials$")
	public void the_user_enters_the_valid_credentials() throws InterruptedException 
	{
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("milindh");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("P@$$w0rd");
		Thread.sleep(1000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='signon']"));
		submit.click();
	}

	@When("^the user is signed in$")
	public void the_user_is_signed_in() 
	{
		System.out.println("Signed in");
	}
	
	@When("^the user clicks on Fish and selects the fish$")
	public void the_user_clicks_on_Fish_and_selects_the_fish() throws InterruptedException 
	{
		WebElement fish = driver.findElement(By.xpath("//div[@id='Content']//a[1]"));
		fish.click();
		Thread.sleep(2000);
		WebElement fish2 = driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']"));
		fish2.click();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
	}

	@When("^User clicks on add to cart$")
	public void user_clicks_on_add_to_cart() throws InterruptedException 
	{
		WebElement fish3 = driver.findElement(By.xpath("//tbody/tr[2]/td[5]/a[1]"));
		fish3.click();
		Thread.sleep(2000);
	}

	@When("^user clicks on proceed to checkout$")
	public void user_clicks_on_proceed_to_checkout() throws InterruptedException
	{
		WebElement proceed = driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']"));
		proceed.click();
		Thread.sleep(2000);
	}

	@When("^User inputs the shipping detials$")
	public void user_inputs_the_shipping_detials() 
	{
		System.out.println("Shipping Details Updated");
	}

	@When("^The user clicks on Continue$")
	public void the_user_clicks_on_Continue() throws InterruptedException 
	{
		WebElement cont = driver.findElement(By.xpath("//input[@name='newOrder']"));
		cont.click();
		Thread.sleep(2000);
		
		
	}

	@When("^the user clicks on confirm$")
	public void the_user_clicks_on_confirm() throws InterruptedException 
	{
		WebElement confirm = driver.findElement(By.xpath("//a[normalize-space()='Confirm']"));
		confirm.click();
		Thread.sleep(2000);
		
		driver.getTitle();
	}
	
	@When("^the user clicks on the home page button$")
	public void the_user_clicks_on_the_home_page_button() throws InterruptedException 
	{
		WebElement home = driver.findElement(By.xpath("//a[@href='/actions/Catalog.action']"));
		home.click();
		Thread.sleep(2000);
	}
	
	@When("^the user clicks on Bird and selects the Bird$")
	public void the_user_clicks_on_Bird_and_selects_the_Bird() 
	{
		WebElement bird = driver.findElement(By.xpath("//div[@id='Content']//a[5]"));
		bird.click();
	}

	@When("^user added the bird to cart$")
	public void user_added_the_bird_to_cart() throws InterruptedException 
	{
		WebElement birdSel = driver.findElement(By.xpath("//a[normalize-space()='AV-CB-01']"));
		birdSel.click();
		Thread.sleep(2000);
//		WebElement birdSel1 = driver.findElement(By.xpath("//a[normalize-space()='EST-18']"));
//		birdSel1.click();
		
	}

	@When("^user checked out$")
	public void user_checked_out() 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Add to Cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
		driver.findElement(By.xpath("//input[@name='newOrder']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Confirm']")).click();
		
		
	}

	@When("^user completes the order$")
	public void user_completes_the_order() 
	{
		System.out.println("Order Complete");
	}
	

	

}
