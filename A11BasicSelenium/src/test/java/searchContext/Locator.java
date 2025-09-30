package searchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Nidhi Ghalot");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Nisa@2344");
		
		WebElement LogIn=driver.findElement(By.xpath("//button[text()='Log in']"));
		LogIn.click();

		Thread.sleep(3000);
		
		driver.navigate().back();
		
		username=driver.findElement(By.id("email"));
		username.clear();
		
		Thread.sleep(1000);
			
		driver.quit();
	}

}
