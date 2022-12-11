package StepDefinition;



import org.Name.LoginPage;
import org.apache.velocity.runtime.parser.node.ASTElseIfStatement;
import org.junit.After;
//import org.logindetails.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Then.Thens;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	public static WebDriver driver;
	public static LoginPage lp;	
//	@org.junit.Before
//	public static void launchBrowser () throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\Users\\gpriyan\\Documents\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		
//		lp=new LoginPage(driver);
//	    
//		//launch demo page
//		driver.get("https://www.amazon.com/");
//		
	//	lp=new LoginPage(driver);
		
//      String browser = null;
//	if (browser.equals ("Chrome") ) {
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	}else if (browser. equals("firefox")) {
//	WebDriverManager.firefoxdriver().setup();
//	driver=new FirefoxDriver();
//	}else if (browser. equals ("edge")) {
//	WebDriverManager.edgedriver().setup();
//	driver=new EdgeDriver();
//	}else {
//
//	throw new Exception ("Given browser name is not matching");
//	}
//	}

	
//	public static void openApp (String url) {
//	//	lp=new LoginPage(driver);
//	driver.get (url);
//	
//	}
	@io.cucumber.java.en.Given("I open server url")
	public void loginTitleName()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\gpriyan\\Documents\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		lp=new LoginPage(driver);
	    
		//launch demo page
		driver.get("https://www.amazon.com/");
//		lp=new LoginPage(driver);
//		lp.loginTitle();
	}
	
	@Then("I validate Amazone page title")
	public void titleLoginName()
	{
	  lp.loginTitleOne();	
	}
	
	@When("I click loginButton")
	public void loginButtonOne()
	{
		lp.signInButton();
	}
	
	@When("^I enter username (.*)$")
	public void loginName(String name)
	{
		lp.loginUserName(name);
	}
	
	@And("I click continue button")
	public void loginButton()
	{
		lp.clickCountinueBtn();
	}
	
	@And("^I enter userpassword (.*)$")
	public void loginUserPassword(String password)
	{
		lp.loginPassword(password);
	}
	
	@And("I enter submit button")
	public void passwordLoginBtn()
	{
		lp.clickSubmitBtn();
	}
	
	@And("I perform mouse over action")
	public void mouseOverPerform()
	{
	   lp.logOutArrow();
	}
	
	@And("I click logout button")
	public void logOutBtn()
	{
		lp.signOutButtonOne();
	}
	

	
	
	
	

}

