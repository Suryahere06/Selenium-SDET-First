package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Surya/Downloads/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.close();

	}

}
