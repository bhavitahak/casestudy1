package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageObjects {
	WebDriver driver;
	
	public PageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[contains(text(),'SignUp')]")
	public static WebElement SignUp;
}
