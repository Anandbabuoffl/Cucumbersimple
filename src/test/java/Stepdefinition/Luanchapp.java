package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Luanchapp {
	WebDriver driver;
	@Given("Open chrome browser")
	public void open_chrome_browser() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C://Browserdrivers//chromedriver.exe"); driver=new ChromeDriver();
		 */
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    
	}
	@When("Navigate to app url")
	public void navigate_to_app_url() {
	   driver.get("https://skedgo.com/tripgo/");
	    
	}
	@Then("Verify the page title")
	public void verify_the_page_title() {
	  String pagetitle= driver.getTitle();
	  System.out.println(pagetitle);
	    
	}
	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}

}
