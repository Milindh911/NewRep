package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest 
{
	 WebDriver driver =null;
	 String baseUrl = "https://www.google.com/";
	
	
	@Given("^browser is open$")
	public void browser_is_open() 
	{
	    System.out.println("Milindh");
	    
	    System.setProperty("webdriver.chrome.driver", "/Users/MI20463606/Downloads/chromedriver_mac_arm64/chromedriver");
//	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
//		driver.navigate().to("https://www.seleniumeasy.com/index.php");
		driver.manage().window().fullscreen();
	    
	}

	@And("^user can navigate to the search box$")
	public void user_can_navigate_to_the_search_box() 
	{
		WebElement search = driver.findElement(By.name("q"));
	}

	@When("^user enters text in google search box$")
	public void user_enters_text_in_google_search_box() 
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Manchester United");
	}

	@And("^user hits enter button$")
	public void user_hits_enter_button() 
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(Keys.ENTER);
	}

	@Then("^user is navigated to search result page$")
	public void user_navigated_to_search_result_page() 
	{
		driver.close();
	}

}
