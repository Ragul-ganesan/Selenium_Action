package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class telegram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://web.telegram.org/k/");
		Thread.sleep(1500);
		//d.findElement(By.xpath("//span[text()='Log in by phone Number']")).click();
//		d.findElement(By.xpath("//div[@class='c-ripple']")).click();
		WebElement A=d.findElement(By.xpath("//button[contains(@class,'btn-primary btn-secondary')]"));
		Thread.sleep(1500);
		Actions B=new Actions(d);
		B.moveToElement(A).click().perform();
		Thread.sleep(1500);
		d.quit();
	}

}
