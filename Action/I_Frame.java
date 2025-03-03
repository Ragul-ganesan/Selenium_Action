package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("file:///C:/Users/AK/Downloads/iframe%20(1).html");
//		d.switchTo().frame("frame1");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
//		d.switchTo().defaultContent();
		d.switchTo().parentFrame();
		d.findElement(By.xpath("//a[text()='Google']")).click();
		Thread.sleep(2000);
		d.quit();
		

}
}