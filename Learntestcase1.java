package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learntestcase1 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://aidaform.com/signup/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("btn-signup")).click();
	driver.findElement(By.name("nickname")).sendKeys("abc");
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.name("confirm")).sendKeys("abc123");
	//driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.close();
}
}
