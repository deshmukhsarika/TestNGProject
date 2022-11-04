package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {

 public WebDriver driver;
 
 By firstname=By.xpath("//input[@name='UserFirstName']");
 By lastname=By.xpath("//input[@name='UserLastName']");
 By workmail=By.xpath("//input[@name='UserEmail']");
 By jobtitle=By.xpath("//input[@name='UserTitle']");
 By companyname=By.xpath("//input[@name='CompanyName']");
 By employees=By.xpath("//select[@name='CompanyEmployees']//option[@value='100']");
 By userphone=By.xpath("//input[@name='UserPhone']");
 By Country=By.xpath("//select[@name='CompanyCountry']//option[@value='GR']");
 By checkbox=By.xpath("//div[@class='checkbox-ui']");

 public signUpPageObjects(WebDriver driver2) {
  this.driver=driver2;
 }
 public WebElement enterFirstname() 
 {
  return driver.findElement(firstname);
 }
  public WebElement enterLastname() 
 {
  return driver.findElement(lastname);
 }
 public WebElement entertWorkmail()
 {
 return driver.findElement(workmail);
 }
 public WebElement enterJobtitle()
 {
 return driver.findElement(jobtitle);
 }
 public WebElement entercompanyname()
 {
 return driver.findElement(companyname);
 }
 public WebElement enteremployees()
  {
return driver.findElement(employees);
	
  }
 public WebElement enterUserPhone()
  {
 return driver.findElement(userphone);
  }
 public WebElement entercountry()
  {
 return driver.findElement(Country);
  }
 public WebElement entercheckbox()
  {
  return driver.findElement(checkbox);
  }
  }