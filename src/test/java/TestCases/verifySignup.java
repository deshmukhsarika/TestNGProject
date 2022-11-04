package TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import pageObjectModel.signUpPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class verifySignup extends baseClass {

 @Test
 public void signup() throws IOException, InterruptedException {
  
  LoginPageObject obj=new  LoginPageObject(driver);
  obj.clickOnTryForFree().click();
  signUpPageObjects  SPO=new signUpPageObjects (driver);
   
  Thread.sleep(5000);
  SPO.enterFirstname().sendKeys(Constant.firstname);
  SPO.enterLastname().sendKeys(Constant.lastname);
  SPO.entertWorkmail().sendKeys(Constant.email);
  SPO.enterJobtitle().sendKeys(Constant.jobTitle);
  SPO.entercompanyname().sendKeys(Constant.company);
  SPO.enteremployees().click();
  SPO.enterUserPhone().sendKeys(Constant.phone);
  SPO.entercountry().click();
  SPO.entercheckbox().click();
  //employee dropdown
  CommonUtilities.handleStaticDropdown(SPO.enteremployees(), 1);
  
  Thread.sleep(3000);
  
  //Country
  CommonUtilities.handleStaticDropdown(SPO.entercountry(), 2);
  
  
  }
 }