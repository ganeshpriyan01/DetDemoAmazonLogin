package StepDefinition;



import java.io.FileInputStream;
import java.util.Properties;

import org.Name.LoginPage;
import org.apache.velocity.runtime.parser.node.ASTElseIfStatement;
import org.junit.After;
//import org.logindetails.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import HookesPage.BrowserPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Then.Thens;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	public static WebDriver driver;
	public static LoginPage lp;	
	public static BrowserPage bp;

	
	@Before
	public void browserOpenPage() throws Exception
	{
		Properties pro=new Properties();
		FileInputStream file =new FileInputStream("D:\\Users\\gpriyan\\Documents\\NewAmazonLoginDetails\\target\\Config.properties");
		pro.load(file);
		String browser=pro.getProperty("newbrowser");
		String urls=pro.getProperty("URL");
		
	if (browser.equals ("chrome") ) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}else if (browser. equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}else if (browser. equals ("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}else {
	
		throw new Exception ("Given browser name is not matching");
		}
	
	driver.get(urls);
}
	@io.cucumber.java.en.Given("I open server url")
	public void loginTitleName()
	{
		
		driver.manage().window().maximize();
	}
	
	@Then("I validate Amazone page title")
	public void titleLoginName()
	{
		lp=new LoginPage(driver);
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
	
@io.cucumber.java.After
public void closeBrowser()
{
	driver.close();
}
	
	
	
	

}

