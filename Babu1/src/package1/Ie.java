package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.ie.driver", "C:\\Users\\babum\\Downloads\\selenium\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
		    WebDriver ie = new InternetExplorerDriver();
		ie.get("https://www.toolsqa.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
Thread.sleep(200);		
ie.close();
ie.quit();
		
	}

}
