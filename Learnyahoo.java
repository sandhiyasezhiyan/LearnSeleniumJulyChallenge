package LearnJulyChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnyahoo {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://finance.yahoo.com/most-active");
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		Double lowestprice = Double.MAX_VALUE;
		String lowestpricecompanyname="";
		String lowestmarketcap="";
		for(WebElement row:rows) {
			try {
				WebElement priceelement = driver.findElement(By.xpath("//table//tr//td[3]"));
				WebElement companynameelement = driver.findElement(By.xpath("//table//tr//td[1]/a"));
				WebElement marketcapElement = driver.findElement(By.xpath("//table//tr//td[7]"));
				Double price = Double.parseDouble(priceelement.getText().replace(",",""));
				String companyName = companynameelement.getText();
				String marketcap = marketcapElement.getText();
				if(price < lowestprice) {
					lowestprice=price;
					lowestpricecompanyname = companyName;
					lowestmarketcap=marketcap;
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				continue;
				
			}
			
			
		}
		System.out.println("Lowest Price Company name:"+lowestpricecompanyname);
		System.out.println("price:"+lowestprice);
		System.out.println("market cap:"+lowestmarketcap);
		
	}

}
