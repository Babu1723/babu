package package1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) throws InterruptedException 
	{
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().version("95.0.4638.54").setup();
      WebDriver chrome = new ChromeDriver();
	   chrome.get("https://www.google.co.in/");
	  chrome.manage().window().fullscreen();
	   Cookie cookie =new Cookie("babu", "mudhiraj");
       chrome.manage().addCookie(cookie);
	  Set<Cookie> cookies =  chrome.manage().getCookies();                       
		  System.out.println(cookies);
		  
		  
		 for(Cookie Cookie:cookies)
		 {
			System.out.println(Cookie.getName()+"===="+Cookie.getValue()); 

		 }
      // Cookie cookies1 = chrome.manage().getCookieNamed("_gat_gtag_UA_109033876_1");
	  //System.out.println(cookies1)
	       //chrome.manage().deleteCookieNamed("babu");  
		       chrome.manage().deleteAllCookies();  
		       Set<Cookie> cookies1 =  chrome.manage().getCookies();                       
				  System.out.println(cookies1);
				 for(Cookie Cookie:cookies1)
				 {
					System.out.println(Cookie.getName()+"===="+Cookie.getValue()); 

				 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		  chrome.close();
		  chrome.quit();	
	}

}
