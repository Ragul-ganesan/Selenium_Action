package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement m1 = d.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement l1=d.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement m2=d.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement l2 = d.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement loc=d.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		WebElement loc2=d.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		Actions a=new Actions(d);
		a.dragAndDrop(m1, loc).perform();
		Thread.sleep(1500);
		a.dragAndDrop(m2, loc).perform();
		Thread.sleep(1500);
		a.dragAndDrop(l1, loc2).perform();
		Thread.sleep(1500);
		a.dragAndDrop(l2, loc2).perform();
		Thread.sleep(1500);
		d.quit();
	}
}
