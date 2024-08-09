package LearnJulyChallenge;


import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learnspicejet {
public static void main(String[] args) {
	
	//disable notifications
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	//remove info of chrome is being controlled by automation software
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("incognito");
	options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
	ChromeDriver driver = new ChromeDriver(options);
	
	//get implicit wait and load the url
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.spicejet.com/");
	
	//resize the window
	int width = 1200;
	int height = 800;
	Dimension dimension = new Dimension(width, height);
	driver.manage().window().setSize(dimension);
	
	//get the text in flights
	String text = driver.findElement(By.xpath("//div[text()='Flights']")).getText();
	System.out.println(text);
	
	//get the title
	System.out.println(driver.getTitle());
	
	
}
}
