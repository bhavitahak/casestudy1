package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testmeapp.utility.Drivers_browser;

public class DefineStep {
	WebDriver driver;
	
	@Given("App is up")
	public void app_is_up() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=Drivers_browser.drivers("chrome");
		driver.get("http://www.amazon.in");
		/*driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		driver.close();*/
	}

	@Given("user will enter the credentials")
	public void user_will_enter_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
		
	}

	@Given("John purchase microwave for {string} dollars")
	public void john_purchase_microwave_for_dollars(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("has a receipt")
	public void has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("John returns the microwave")
	public void john_returns_the_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he got the refund of {string} dollars")
	public void he_got_the_refund_of_dollars(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("John purchase microwave for {int} dollars")
	public void john_purchase_microwave_for_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("he got the refund of {int} dollars")
	public void he_got_the_refund_of_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	
	@Given("credentials are")
	public void credentials_are(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> data=dataTable.cells();
		int cnt=data.size();
		System.out.println(cnt);
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		
		List<WebElement> lnk_coll=driver.findElements(By.tagName("a"));
		for(int i=0;i<lnk_coll.size()-1;i++) {
			String lnk_count=lnk_coll.get(i).getText();
			System.out.println(lnk_count);
		}
	    
	}
}
