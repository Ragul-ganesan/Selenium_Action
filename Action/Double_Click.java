package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoapp.skillrary.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement res1=d.findElement(By.xpath("(//a[text()='Bhavani '])[2]"));
		res1.click();
		Thread.sleep(1500);
		WebElement add=d.findElement(By.xpath("//button[@id='add']"));
		WebElement sub=d.findElement(By.xpath("//button[@id='minus']"));
		Actions A=new Actions (d);
		A.moveToElement(add).doubleClick().pause(Duration.ofSeconds(10)).moveToElement(sub).doubleClick().perform();
		Thread.sleep(1500);
		d.quit();
		
	}

}
