package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/dropdown");
      driver.manage().window().maximize();
      
      WebElement dropdown = driver.findElement(By.id("dropdown"));
      
      Select sel = new Select(dropdown);
      //sel.selectByIndex(2);
      //sel.selectByVisibleText("Option 1");
       sel.selectByValue("2");
      // driver.close();
         
		
	}

}