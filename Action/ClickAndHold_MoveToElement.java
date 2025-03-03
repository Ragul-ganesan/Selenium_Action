package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement  sr1=d.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement sr2=d.findElement(By.xpath("//input[@type='submit']"));
		Actions a1=new Actions(d);
		a1.moveToElement(sr1).click().sendKeys("Computers").pause(Duration.ofSeconds(2)).moveToElement(sr2).click().perform();		




		Thread.sleep(1500);
		d.quit();
	}

}
 