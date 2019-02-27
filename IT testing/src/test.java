import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\IE_Driver\\IEDriverServer.exe");
WebDriver driver = new InternetExplorerDriver();
driver.navigate().to("http://www.google.com");
driver.manage().window().maximize();

}}

