package Action;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBI_RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions A=new Actions(d);
		A.contextClick().perform();
		Thread.sleep(1500);
		d.switchTo().alert().accept();		
	}   

}
