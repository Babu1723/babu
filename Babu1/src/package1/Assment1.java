package package1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Assment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
	      WebDriver chrome = new ChromeDriver();
		   chrome.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=GenericKW&utm_term=online%20bus%20booking&utm_content=Generic&gclid=EAIaIQobChMIkdW5sq7d8wIV1zUrCh1nTA5tEAAYASAAEgLlB_D_BwE");
		 // chrome.manage().window().fullscreen();
		  chrome.findElement(By.id("source")).sendKeys("Hyd");
		  Thread.sleep(2000);
		  chrome.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		  chrome.findElement(By.id("destination")).sendKeys("Viz");
		  Thread.sleep(2000);
		  chrome.findElement(By.xpath("//li[text()='Vizag']")).click();
		  chrome.findElement(By.id("datepicker1")).click();
          chrome.findElement(By.xpath("(//a[text()='28'])[1]")).click();
		  chrome.findElement(By.id("datepicker2")).click();
		  chrome.findElement(By.xpath("(//a[text()='29'])[1]")).click();
		  Thread.sleep(2000);
		  chrome.findElement(By.xpath("//a[@tabindex='5']")).click();
		  
		  
		  
		  
		List<WebElement> rows =  chrome.findElements(By.xpath("//*[@id='search_list_onward']/div"));
		
		for(int i=2;i<=3;i++)
		{
			System.out.print(chrome.findElement(By.xpath("//*[@id='search_list_onward']/div["+i+"]/div/div[1]/div[1]//span")).getText());
			System.out.print(chrome.findElement(By.xpath("//*[@id='search_list_onward']/div["+i+"]/div/div[1]/div[2]//h2")).getText());
			System.out.print(chrome.findElement(By.xpath("//*[@id='search_list_onward']/div["+i+"]/div/div[1]/div[3]//h2/div[2]")).getText());			
			System.out.println();
		}	
		
		List<WebElement> innerrows =  chrome.findElements(By.xpath("//div[@id='SerVicesDetOneway1']/div/div"));
		System.out.println(innerrows.size());
		for(int i=1;i<=innerrows.size();i++)
		{
			Thread.sleep(1000);
			String text7 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div["+i+"]/div[1]//h2/span[1]")).getText();
	        System.out.print(text7);
	          String text8 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div["+i+"]/div[2]//h2")).getText();
	         System.out.print(text8);		
	         String text9 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div["+i+"]/div[3]/div//h2/span[2]")).getText();
	         System.out.print(text9);	
	         System.out.println();
			
		}	

			
	        
		  
		  
		  
		  
//		  
//	String text = chrome.findElement(By.xpath("//*[@id='search_list_onward']/div[2]/div/div[1]/div[1]//span")).getText();
//          System.out.println(text);
//    String text1 = chrome.findElement(By.xpath("//*[@id='search_list_onward']/div[2]/div/div[1]/div[2]//h2")).getText();
//         System.out.print(text1);
//         String text2 = chrome.findElement(By.xpath("//*[@id='search_list_onward']/div[2]/div/div[1]/div[3]//h2/div[2]")).getText();
//         System.out.print(text2);
//         String text3 = chrome.findElement(By.xpath("(//div[@id='SerVicesDetOneway1TSRTCT']/div/div[1])[1]")).getText();
//         System.out.println(text3);
//         String text4 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1TSRTCT']/div[1]/div[1]//h2/span")).getText();
//         System.out.print(text4);
//         String text5 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1TSRTCT']/div[1]/div[2]//h2")).getText();
//         System.out.print(text5);
//         String text6 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1TSRTCT']/div[1]/div[3]//h2/div[2]")).getText();
//         System.out.println(text6);
//        String text7 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div[1]/div[1]//h2/span[1]")).getText();
//       System.out.print(text7);
//         String text8 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div[1]/div[2]//h2")).getText();
//        System.out.println(text8);		
//        String text9 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div[1]/div[3]/div//h2/span[2]")).getText();
//        System.out.print(text9);
//        String text10 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div[1]/div[1]//h2/span[1]")).getText();
//        System.out.print(text10);
//        String text11 = chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div/div[1]/div[1]//h2/span[1]")).getText();
//        System.out.print(text11);

		
		
		
		
		
		
		
		
		
		
		
		

			Thread.sleep(5000);
			  chrome.close();
			  chrome.quit();		
		

	}

}
