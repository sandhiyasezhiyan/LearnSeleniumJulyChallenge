package LearnJulyChallenge;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class Learnirctc {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.linkText("BUSES")).click();
	Set w = driver.getWindowHandles();
	List<String>listwindows = new ArrayList<String>(w);
	System.out.println("child window handle is"+w);
	Iterator<String> i1 = w.iterator();
	while (i1.hasNext()) {
		String ChildWindow = i1.next();
		if(!w.equals(ChildWindow)) {
			driver.switchTo().window(ChildWindow);
			String pagetitle = driver.getTitle();
			System.out.println("title of the window"+pagetitle);
			System.out.println("child window closed");
		}
	}
	
	System.out.println("switch back to the parent window");
	driver.close();
	
	}
}
