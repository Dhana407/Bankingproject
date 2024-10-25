package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreation {
 public WebDriver ldriver;
 public EmployeeCreation(WebDriver rdriver) {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);
	 
 }
 @FindBy(xpath="//a[@href='Admin_Emp_details.aspx']//img")
 WebElement employee;
 @FindBy(xpath="//a[@href='Admin_Emp_details.aspx']//img")
 WebElement employeesub;
 
 @FindBy(id="BtnNew")
 WebElement btnnewEmp;
 
 @FindBy(id="txtUname")
 WebElement empname;
 
 @FindBy(id="txtLpwd")
 WebElement loginpwd;
 
 @FindBy(id="lst_Roles")
 WebElement selectroles;
 
 @FindBy(id="lst_Branch")
  WebElement selectbranch;
 
 @FindBy(id="BtnSubmit")
 WebElement btnsubmit;
 
 public void clickonmainemployee() {
	 employee.click();
 }
 public void clickonemployee() {
	 employeesub.click();
 }
 public void newemployeebutton() {
	 btnnewEmp.click();
 }
 public void setempname() {
	 empname.sendKeys("Dhana1234");
 }
 public void setpassword() {
	 loginpwd.sendKeys("Dhana@123");
 }
 public void selectroles() {
	 Select roles=new Select(selectroles);
	 roles.selectByIndex(8);
 }
 public void selectbranch() {
	 Select branch=new Select(selectbranch);
	 branch.selectByVisibleText("hyderabad");
 }
 public void clickonsubmit() {
	 btnsubmit.click();
 }
}
