package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import OOPsAssignment3.Webelement;

public class LearnTestcase2 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://gemini.google.com/");
	driver.findElement(By.xpath("//span[text()=' Sign in ']")).click();
	driver.findElement(By.id("identifierId")).sendKeys("sandhu180898@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	String title01 = driver.findElement(By.className("gemini-logo")).getText();
	System.out.println(title01);

}
}
