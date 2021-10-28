package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver chrome = new ChromeDriver(ops);
		    chrome.get("https://demoqa.com/droppable");
		    chrome.manage().window().maximize();
		    Actions action = new Actions(chrome);
		WebElement source = chrome.findElement(By.id("draggable"));
		WebElement target = chrome.findElement(By.id("droppable"));
        action.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		WebElement click = chrome.findElement(By.xpath("(//*[@role='tab'])[2]"));
       action.moveToElement(click).click().build().perform();
     System.out.println(chrome.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[1]")).getLocation());
		WebElement sou = chrome.findElement(By.id("acceptable"));
	    // WebElement tar = chrome.findElement(By.id("droppable"));
        action.dragAndDropBy(sou,700,150).build().perform();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	chrome.close();
	chrome.quit();
		
		
	}

}
