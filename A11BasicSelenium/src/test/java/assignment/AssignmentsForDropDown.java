package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentsForDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/select-menu");
		
		
		//1. Navigate to (https://demoqa.com/select-menu) and select an option from the dropdown by index.
				Select select =new Select(driver.findElement(By.id("cars")));
						select.selectByIndex(2);
						WebElement selected=select.getFirstSelectedOption();
				        System.out.println("Standard multi select option: " + selected.getText());
		
		//2. Open (https://demoqa.com/select-menu) and select an option using the value attribute
		Select select1 =new Select(driver.findElement(By.id("oldSelectMenu")));
        	select1.selectByValue("5");  // selects the option with value="6" → "White"

				WebElement selected1 = select1.getFirstSelectedOption();
		        System.out.println("Selected option: " + selected1.getText());      
		        
		//3.  Visit (https://demoqa.com/select-menu) and select an option by visible text. 
		Select select2 = new Select(driver.findElement(By.id("oldSelectMenu")));
		        select2.selectByVisibleText("White");  // selects the option with visible text "White"

		        System.out.println("Selected option: " + select2.getFirstSelectedOption().getText());
		        
		//4. Open (https://demoqa.com/select-menu), and print all available options in the dropdown.
		        
		        Select select3 = new Select(driver.findElement(By.id("oldSelectMenu")));

		        List<WebElement> options = select3.getOptions();
		        System.out.println("Available options in Old Style Select Menu:");
		        int i=1;
		        for (WebElement opt : options) {
		            System.out.println(i+":" +opt.getText());
		            i++;
		        }

		//5. Test the dropdown at (https://demoqa.com/select-menu) and check if it is multi-selectable.  
		        Select multi = new Select(driver.findElement(By.id("cars")));
		        boolean isMulti = multi.isMultiple();
		        System.out.println("Is multi-selectable? " + isMulti);

		        if (isMulti) {
		            // select multiple options
		            multi.selectByVisibleText("Volvo");
		            multi.selectByValue("saab");
		            multi.selectByIndex(2);  // e.g. Opel

		            List<WebElement> selected2 = multi.getAllSelectedOptions();
		            System.out.println("Selected options:");
		            for (WebElement opt : selected2) {
		                System.out.println(opt.getText());
		            }

		            // then optionally deselect
		            multi.deselectAll();
		        }
		        
		   //6. Navigate to (https://demoqa.com/select-menu) and select the first and last options in the dropdown.
		        
		        Select select4 = new Select(driver.findElement(By.id("oldSelectMenu")));

		        List<WebElement> allOptions = select4.getOptions();
		        int lastIndex = allOptions.size() - 1;

		        // Select first option (index 0)
		        select4.selectByIndex(0);
		        System.out.println("First selected: " + select.getFirstSelectedOption().getText());

		        // Select last option
		        select4.selectByIndex(lastIndex);
		        System.out.println("After re-selecting last: " + select.getFirstSelectedOption().getText());

		   //7.
		  
		        
		        Thread.sleep(1000);
				driver.quit();
		
	}

}
