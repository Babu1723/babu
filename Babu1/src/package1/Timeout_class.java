package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Timeout_class {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
	      WebDriver chrome = new ChromeDriver();
		   chrome.get("https://www.google.co.in/");
		   chrome.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
		
		
		
		
	Thread.sleep(5000);
	chrome.close();
	chrome.quit();
		
		
	}

}
