package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web {

	public static void main(String[] args) throws InterruptedException
	{
    WebDriverManager.iedriver().setup(); 
    WebDriver chrome = new InternetExplorerDriver();
    chrome.get("https://www.google.co.in/");
		
		
		
		
		
		
		
		
		
		
		
	Thread.sleep(5000);	
	chrome.close();
	chrome.quit();
		
	}

}
