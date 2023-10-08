package prac6;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prac6 {
	static String driverpath = "C:\\Users\\Admin\\Desktop\\Practicals\\503 STQA\\geckodriver.exe";
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		String appurl = "https://www.google.com/";
		driver.get(appurl);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=1; i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		System.out.println("Total number of links: "+links.size());
	}
}
