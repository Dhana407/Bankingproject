package stepDefinitions;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Branchcreation;
import pageObjects.EmployeeCreation;
import pageObjects.LoginSteps;

public class Steps extends Baseclass{
	public WebDriver driver;
	public LoginSteps lp;
	public Branchcreation bc;
	public EmployeeCreation ec;
	public Properties configprop;
	
	
	@Before
	public void setup() throws IOException{
		
		
		//Reading properties file
		configprop=new Properties();
		FileInputStream configpropfile= new FileInputStream("config.properties");
        configprop.load(configpropfile);
        
		String  br=configprop.getProperty("browser");
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",configprop.getProperty("chromepath"));
	    driver=new ChromeDriver();
	    }
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",configprop.getProperty("iepath"));
		    driver=new InternetExplorerDriver();
		    }
	    
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}
	
	
	

	@Given("open browser")
	public void open_browser() {
		//driver=new ChromeDriver();
		lp=new LoginSteps(driver);
		
	}

	@When("enter the url of primus bank")
	public void enter_the_url_of_primus_bank() {
		driver.navigate().to("http://primusbank.qedgetech.com/");
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
		driver.findElement(By.xpath("//a[@href='home.aspx']//img")).isDisplayed();
	}

	@When("enter the username & password")
	public void enter_the_username_password() {
		 
		    lp.setUserName();
		    lp.setpassword();
	}
	
	@And("click on login button")
	public void click_on_login_button() {
	    lp.clicklogin();
	}
	
	//branch creation

	@Then("click on the branches")
	public void click_on_the_branches() {
	
	    bc=new Branchcreation(driver);
	    bc.clickonbranches();
	}

	@Then("click on new Branch")
	public void click_on_new_branch() {
	    bc.clickonnewbranch();
	}

	@When("enters the new Branch entry")
	public void enters_the_new_branch_entry() {
	    bc.setBranchName();
	    bc.setAddress();
	    bc.enterZipcode();
	    bc.selectCountry();
	    bc.selectCity();
	    bc.selectState();
	}

	@When("click on submit")
	public void click_on_submit() {
	    bc.clickonsubmit();
	}
	@Then("primusbank homepage will displayed")
	public void primusbank_homepage_will_displayed() {
	    driver.getPageSource().contains("Welcome to Admin");
	    
	}

	@When("click on employee main&employee sub menu")
	public void click_on_employee_main_employee_sub_menu() {
	   ec=new EmployeeCreation(driver);
	   ec.clickonmainemployee();
	   ec.clickonemployee();
	}

	@And("click on new Employee")
	public void click_on_new_employee() {
	   ec.newemployeebutton();
	}

	@Then("enters the details in New Employee Creation")
	public void enters_the_details_in_new_employee_creation() {
	   ec.setempname();
	   ec.setpassword();
	   ec.selectroles();
	   ec.selectbranch();
	}

	@And("click on submit button")
	public void click_on_submit_button() {
	    ec.clickonsubmit();
	}



	@Then("close the browser")
	public void close_the_browser() {
	   driver.quit();
	}



}
