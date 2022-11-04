package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

 public WebDriver driver;  //This driver dont have scope
 
 By username=By.xpath("//input[@id='username']");
 By password=By.xpath("//input[@id='password']");
 By logIn=By.xpath("//input[@id='Login']");
 By tryForFree=By.xpath("//a[@id='signup_link']");
 By ActualErrorMsg=(By.xpath("//div[@id='error']"));
 
 
 public LoginPageObject(WebDriver driver2) {
  
  this.driver=driver2;
 }


 public WebElement enterUsername() {
  return driver.findElement(username);
 }
 
 
 public WebElement enterPssword() {
  return driver.findElement(password);
 }
 
 public WebElement clickOnLogin() {
  return driver.findElement(logIn);
 }
 
 
 public WebElement clickOnTryForFree() {
  return driver.findElement(tryForFree);
 }
 
 public WebElement ActualerrorMsg() {
	  return driver.findElement(ActualErrorMsg);
	 }
 }