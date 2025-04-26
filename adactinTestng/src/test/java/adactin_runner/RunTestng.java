package adactin_runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.Baseutils;
import com.page.manager.PageManager;
import com.property.reader.ConfigurationReader;


public class RunTestng extends Baseutils {
	//WebDriver driver;
	PageManager pm; 
	//ConfigurationReader cr;

	@Test(groups = {"smoketest"})
	private void browserLaunch() {
		browserLaunch("chrome");
	}

	@Test(priority = 0 , groups = {"smoketest"})
	private void url() throws IOException, InterruptedException {
		//cr= new ConfigurationReader();
		pm=new PageManager(driver);
		urlLaunch(pm.getCr().url());
		maximize();
		Thread.sleep(1000);
        
	}

	@Test(priority = 1)
	private void userName() throws IOException {
		//cr=new ConfigurationReader();
		pm=new PageManager(driver);
		inputOnElement(pm.getLp().getUser(), pm.getCr().userName());

	}

	@Test(priority = 2 )
	private void password() throws IOException {
		//cr=new ConfigurationReader();
		pm=new PageManager(driver);
		inputOnElement(pm.getLp().getPassword(), pm.getCr().password());

	}

	@Test(priority = 3)
	private void login() {
		pm = new PageManager(driver);
		pm.getLp().getLoginBtn().click();

	}

}
