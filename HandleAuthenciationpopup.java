package LearnJulyChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAuthenciationpopup {

	@Test
	public void handleAuth() {
		String username="admin";
		String password="admin";
		System.setProperty("webdriver.exe", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("div#content>div>p")).getText();
		System.out.println(text);
		String expected = "Congratulations! You must have the proper credentials.";
		Assert.assertEquals(text, expected);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		
		

	}
}


