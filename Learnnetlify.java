package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnnetlify {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://commercejs-demo-store.netlify.app/");
	driver.findElement(By.xpath("//a[@class='mr-4 font-color-black']")).click();
	driver.findElement(By.xpath("(//p[contains(@class,'mb-2 position-relative')])[2]")).click();
	driver.findElement(By.xpath("//a[@href='/product/shampoo-conditioner']//div[1]")).click();
	driver.findElement(By.xpath("//span[contains(@class,'flex-grow-1 mr-3')]")).click();
}
}
