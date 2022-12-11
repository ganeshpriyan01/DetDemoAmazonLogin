package HookesPage;

import java.io.FileInputStream;
import java.util.Properties;

import org.Name.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPage {
	public WebDriver driver;
	
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
}




