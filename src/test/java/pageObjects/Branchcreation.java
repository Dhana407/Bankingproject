package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branchcreation 
{
	public WebDriver ldriver;
	public Branchcreation(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']//img")
	WebElement branches;
	
	@FindBy(name="BtnNewBR")
	WebElement newbranch;
	
	@FindBy(id="txtbName")
	WebElement txtbranchname;
	
	@FindBy(id="txtAdd1")
	WebElement txtadd;
	
	@FindBy(id="txtZip")
	WebElement txtzipcode;
	
	@FindBy(id="lst_counrtyU")
	WebElement country;
	
	@FindBy(id="lst_cityI")
	WebElement city;
	
	@FindBy(id="lst_stateI")
	WebElement state;
	
	@FindBy(id="btn_insert")
	WebElement btnsubmit;
	
	public void clickonbranches() {
		branches.click();
	}
	public void clickonnewbranch() {
		newbranch.click();
	}
	public void setBranchName() {
		txtbranchname.sendKeys("Dhana123");
	}
	public void setAddress() {
		txtadd.sendKeys("banjarahills,roaadno:10");
	}
	public void enterZipcode() {
		txtzipcode.sendKeys("56003");
	}
	public void selectCountry() {
		Select drpcountry=new Select(country);
		drpcountry.selectByIndex(0);
	}
	public void selectCity() {
		Select drpcity=new Select(city);
		drpcity.selectByIndex(0);
	}
	public void selectState() {
		Select drpstate=new Select(state);
		drpstate.selectByIndex(0);
	}
	public void clickonsubmit() {
		btnsubmit.click();
	}
	
	
	

}
