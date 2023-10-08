package prac7;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class prac7 {
	static String driverpath = "C:\\Users\\Admin\\Desktop\\Practicals\\503 STQA\\geckodriver.exe";
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		String appurl = "file:///C:/Users/Admin/Desktop/Practicals/503%20STQA/continents.html";
		driver.get(appurl);
		Select select = new Select(driver.findElement(By.id("continents")));
		java.util.List<WebElement> options = select.getOptions();
		for(int i = 0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		System.out.println("Total number of items in dropdown: "+ options.size());
	}
}
