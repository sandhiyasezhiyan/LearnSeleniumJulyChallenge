package LearnJulyChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCartify {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cartify.pk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='site-nav__label'])[3]")).click();
		driver.findElement(By.xpath("//div[text()[normalize-space()='Cloth Rack']]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'grid-view-item__link grid-view-item__image-container')]")).click();
		driver.findElement(By.xpath("//span[text()[normalize-space()='Add to cart']]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'cart-popup__cta-link btn')]")).click();
		WebElement subtotal = driver.findElement(By.xpath("//span[text()='Subtotal']/following-sibling::span"));
		String subtotalprice = subtotal.getText();
		System.out.println("the subtotal is:"+subtotalprice);
		driver.close();
	}

}
