package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basiclocations {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.marutisuzuki.com/");
	driver.findElement(By.xpath("//img[@src='/images/homepage/search_icon.webp']")).click();
	driver.findElement(By.name("key")).sendKeys("Swift",Keys.ENTER);
	driver.findElement(By.className("anchor-noline")).click();
	WebElement dd = driver.findElement(By.id("selectcity1"));
	Select sel1 = new Select(dd);
	int countofoptions = sel1.getOptions().size();
	System.out.println("the total no of options in the dropdown:"+countofoptions);
	

	WebElement dd01 = driver.findElement(By.id("selectcity1"));
	Select sel2 = new Select(dd01);
	sel2.selectByVisibleText("ZIRO");
	
	driver.findElement(By.partialLinkText("SAFETY")).click();
	String text = driver.findElement(By.xpath("//h5[text()='6 Airbags']/following-sibling::p")).getText();
	System.out.println(text);
	
	driver.findElement(By.partialLinkText("COLOURS")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("pmm-blue--pa-white")).click();
	driver.close();

	
	
}
}
