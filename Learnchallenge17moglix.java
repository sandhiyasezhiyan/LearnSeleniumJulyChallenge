package LearnJulyChallenge;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learnchallenge17moglix {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.moglix.com/");
	driver.findElement(By.id("search-input")).sendKeys("TV",Keys.ENTER);
	
	//Retrieve and parse the prices of all listed TVs.
	 java.util.List<WebElement> alltvprices = driver.findElements(By.xpath("//div[@class='prod-selling-price ng-star-inserted']//span"));
	int tvprice = alltvprices.size();
	//Sort the list of TV prices in ascending order.
	ArrayList<Integer> listValue = new ArrayList<Integer>();
	for (int i = 0; i <tvprice; i++) {
		String text = alltvprices.get(i).getText();
		String replaceAll = text.replaceAll("[, ₹]", "");
		int parseInt = Integer.parseInt(replaceAll);
		listValue.add(parseInt);
	}

	Collections.sort(listValue);
	System.out.println(listValue);
	
	//Find the TV with the lowest price and add it to the cart.
	for(Integer integer:listValue) {
		String minvalue =String.valueOf(integer);
		if(!minvalue.isEmpty() &&minvalue.contains(minvalue)) {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[@class='pwa-image']/img")));
			WebElement click =driver.findElement(By.xpath("//span[text()='ADD TO CART']"));
			driver.executeScript("arguments[0].click();", click);

			}
		
	}
	//add to cart and retrieve the prices
	driver.findElement(By.xpath("//a[@class='icon-cart1']")).click();
	String amount =  driver.findElement(By.xpath("//span[@class='tag-value ng-star-inserted']")).getText();
	System.out.println(amount);


	 

   

	
}
}
