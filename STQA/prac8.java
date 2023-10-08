package prac8;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class prac8 {
	static String driverpath= "C:\\Users\\Admin\\Desktop\\Practicals\\503 STQA\\geckodriver.exe";
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		String appurl = "file:///C:/Users/Admin/Desktop/Practicals/503%20STQA/checkbox.html";
		driver.get(appurl);
		java.util.List<WebElement> checkboxes = driver.findElements(By.id("c"));
		int checked=0, unchecked=0;
		for(int i = 0; i<checkboxes.size(); i++) {
			System.out.println(i + " check box is checked = " + checkboxes.get(i).isSelected());
			if(checkboxes.get(i).isSelected()==true) {
				checked += 1;
			}
			else {
				unchecked += 1;
			}
		}
		System.out.println("Total number of checked checkboxes: " + checked);
		System.out.println("Total number of unchecked checkboxes: " + unchecked);
	}

}
