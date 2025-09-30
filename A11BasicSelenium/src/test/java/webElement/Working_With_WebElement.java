package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_WebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	/*	WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");

		Thread.sleep(1000);
		un.clear();
		Thread.sleep(1000);
	    un.sendKeys("9625244417");

		WebElement loginBtn = driver.findElement(By.name("login"));
		String tag = loginBtn.getTagName();
		String attValue = loginBtn.getAttribute("data-testid");
		String cssValue = loginBtn.getCssValue("font-family");
		String text = loginBtn.getText();
		
		System.out.println("Css value : " + cssValue);
		System.out.println("Att value : " + attValue);
		System.out.println("Tagname : " + tag);
		System.out.println("Text value : " + text);

		if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
			loginBtn.click();
			//loginBtn.submit();
			}

		driver.navigate().back();
		*/

		driver.findElement(By.linkText("Create new account")).click();

		WebElement female = driver.findElement(By.xpath("//label[text()='Female']/input"));
		
		female.click();
		Thread.sleep(1000);
		
		if (female.isDisplayed() && female.isEnabled()) {
	//	female.click();
		female.submit();
		}
	
		if (female.isSelected()) {
			System.out.println("Female radio button is selected");
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
