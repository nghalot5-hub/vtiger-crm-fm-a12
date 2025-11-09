package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
public static void main(String[] args) {
	ChromeOptions setting=new ChromeOptions();
	setting.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/");
}
}
