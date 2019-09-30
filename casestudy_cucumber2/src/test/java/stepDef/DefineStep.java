package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browser.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DefineStep {
	WebDriver driver;

	@Given("App is launched")
	public void app_is_launched() {
		driver=Drivers.drivers("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("SignUp")
	public void signup() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=Drivers.drivers("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");*/
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	}

	@Given("username is {string}")
	public void username_is(String string) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("first name is {string}")
	public void first_name_is(String string) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("lastname is {string}")
	public void lastname_is(String string) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("password is {string}")
	public void password_is(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("confirm password is {string}")
	public void confirm_password_is(String string) {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("gender is {string}")
	public void gender_is(String string) {
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[6]/div[1]/div[1]/label[1]/input[2]")).click();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("email is {string}")
	public void email_is(String string) {
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("mobile number is {string}")
	public void mobile_number_is(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("DOB is {string}")
	public void dob_is(String string) {
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("address is {string}")
	public void address_is(String string) {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("security question is {string}")
	public void security_question_is(String string) {
		Actions action=new Actions(driver);
		WebElement squestion=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		action.moveToElement(squestion).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("answer is {string}")
	public void answer_is(String string) {
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("Register")
	public void register() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		//driver.close();
	}

	@Given("Signin")
	public void signin() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		Thread.sleep(1000);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("Enter {string}")
	public void enter(String string) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("Type {string}")
	public void type(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("login")
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(2000);
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("signin with credentials {string} and {string}")
	public void signin_with_credentials_and(String string, String string2) {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("search for a product")
	public void search_for_a_product() {
		Actions act =new Actions(driver);
		WebElement search=driver.findElement(By.id("myInput"));
		act.keyDown(search, Keys.SHIFT).sendKeys("B").pause(3000).sendKeys("A").pause(3000).sendKeys("G").pause(3000).keyUp(Keys.SHIFT).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Shopping bag')]"))).click().perform();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("click on find details")
	public void click_on_find_details() {
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("click on add to cart")
	public void click_on_add_to_cart() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("click on cart")
	public void click_on_cart() {
		try {
			driver.findElement(By.partialLinkText("Cart")).click();
		}catch(Exception e) {
			System.out.print(e);
		}

		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("check if the added product is in cart or not")
	public void check_if_the_added_product_is_in_cart_or_not() {
		WebElement ca = driver.findElement(By.tagName("h4"));
		String productname = ca.getText();
		if(productname=="Shopping Bag") {
			System.out.println("Valid product");
		}
		else
		{
			System.out.println("Invalid product");
		}
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("click on proceed to checkout")
	public void click_on_proceed_to_checkout() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}
}