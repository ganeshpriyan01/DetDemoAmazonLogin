package org.Name;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	public WebDriver driver;
	//Actions mouseActions=new Actions(driver);
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id = "nav-logo-sprites")
	private WebElement titleNameOne;
	
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement signButton;
	
 @FindBy(className = "a-icon a-icon-logo")
 private WebElement titleName;
 
 @FindBy(id = "ap_email")
 private WebElement nameTxt;
 
 @FindBy(id ="continue")
 private WebElement btnClick;
 
 @FindBy(id ="ap_password")
 private WebElement passTxt;
 
 @FindBy(id = "signInSubmit")
 private WebElement submitBtn;
 
 @FindBy(xpath = "(//span[@class='nav-icon nav-arrow'])[2]")
 private WebElement logOut;
 
 @FindBy(xpath = "(//*[contains(text(),'Sign Out')])[2]")
 private WebElement signOutButton;
 
 public void loginTitleOne()
 {
	 titleNameOne.isDisplayed();
 }
 
 public void signInButton()
 {
	signButton.click();
 }
 public void loginTitle()
 {
	 String ms=titleName.getText();
	 System.out.println(ms);
 }
 
 public void loginUserName(String name)
 {
	 nameTxt.sendKeys(name);
 }
 
 public void clickCountinueBtn()
 {
	btnClick.click();
 }
 
 public void loginPassword(String password)
 {
	passTxt.sendKeys(password);
 }
 
 public void clickSubmitBtn()
 {
	 submitBtn.click(); 
 }
 

 public void logOutArrow()
 {
	 Actions mouseActions=new Actions(driver);
	 mouseActions.moveToElement(logOut).perform();
 }

 
 public void signOutButtonOne()
 {
	 signOutButton.click();
 }
 
 

}

