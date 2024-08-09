package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learncheapoair {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt =new ChromeOptions();
	opt.addArguments("disable-notifications");
	ChromeDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.cheapoair.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//close the popup
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
	driver.findElement(By.xpath("//label[text()='One Way']")).click();
	
	//javascript action
	driver.executeScript("window.scrollBy(0,120)");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='suggestion-displayText is--focused']")).click();
	
	
	
	
	
	
}
}
