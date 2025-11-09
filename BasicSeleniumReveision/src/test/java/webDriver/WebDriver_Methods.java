package webDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*WebDriver is an interface
 * void get(String url)
 * @Nullable String getCurrentUrl()
 * @Nullable String getTitle()
 * @Override List<WebElement> findElements(By by)
 * @Override WebElement findElement(By by)
 * @Nullable String getPageSource()
 * void close()
 * void quit()
*/

public class WebDriver_Methods {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.facebook.com/");
	
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("admin");
	
	Thread.sleep(2000);
	
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("12345");
	
	Thread.sleep(2000);
	
	WebElement loginButton=driver.findElement(By.linkText("Log in"));
	loginButton.click();
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	WebElement forgetPasswordButton=driver.findElement(By.xpath("//a[contains(@id,'u_0_6')]"));
	forgetPasswordButton.click();
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	WebElement createNewAccountButton=driver.findElement(By.linkText("Create new account"));
	createNewAccountButton.click();
	
	Thread.sleep(2000);
	
	WebElement firstName=driver.findElement(By.name("firstname"));
	firstName.sendKeys("Testing");
	
	Thread.sleep(2000);


	WebElement lastName=driver.findElement(By.name("lastname"));
	lastName.sendKeys("User");
	
	Thread.sleep(2000);

	//Select class
	WebElement dobDay=driver.findElement(By.xpath("//select[@aria-label='Day']"));
	Select selectDay=new Select(dobDay);
	selectDay.selectByValue("26");
	
	Thread.sleep(2000);
	
	WebElement dobMonth=driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select selectMonth=new Select(dobMonth);
	selectMonth.selectByVisibleText("Aug");
	
	Thread.sleep(2000);

	WebElement dobYear=driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select selectYear=new Select(dobYear);
	selectYear.selectByVisibleText("1998");
	
	Thread.sleep(2000);
	
	WebElement gender=driver.findElement(By.xpath("//label[text()='Female'='sex']/../..//input"));
	//(//input[@id='sex'])[1]
	gender.click();
	
	Thread.sleep(2000);
	
	//Actions Class
	
	WebElement createAPage=driver.findElement(By.linkText("Create a Page"));
	Actions action=new Actions(driver);
	action.moveToElement(createAPage).click().build().perform();
	
	//javaScriptExecutot
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.location='https://www.facebook.com/';");
	WebElement cna=driver.findElement(By.linkText("Create new account"));
	Thread.sleep(2000);
	
	jse.executeScript("arguments[0].click();", cna);
	Thread.sleep(2000);
	
	WebElement customField=driver.findElement(By.xpath("//input[@id='custom_gender' and @name='custom_gender']"));
	String custom="Female ji";
	jse.executeScript("arguments[0].value=arguments[1];",customField,custom);
	
	driver.close();
	
	//iframe popup window
	
	
	
	driver.quit();
	
	}

}
