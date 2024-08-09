package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learnmap {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mapz.com/map");
		driver.findElement(By.linkText("Draw")).click();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions action = new Actions(driver);
		action.moveToElement(email).build().perform();
		
		//retrieve the message that "please fill out in this field"
		String validationmsg = email.getAttribute("validationMessage");
		System.out.println(validationmsg);
		driver.close();
		
		
	}

}
