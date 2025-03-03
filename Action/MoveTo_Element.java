package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo_Element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement A=d.findElement(By.xpath("//a[contains(text(),'Books')]"));
		WebElement B=d.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		WebElement C=d.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		WebElement D=d.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
		WebElement E=d.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
		WebElement F=d.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
		WebElement G=d.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
		Thread.sleep(1500);
		Actions Act=new Actions(d);
		Act.moveToElement(A).pause(Duration.ofSeconds(3)).moveToElement(B).pause(Duration.ofSeconds(3)).moveToElement(C).pause(Duration.ofSeconds(3)).moveToElement(D).pause(Duration.ofSeconds(3)).moveToElement(E).pause(Duration.ofSeconds(3)).moveToElement(F).pause(Duration.ofSeconds(3)).moveToElement(G).pause(Duration.ofSeconds(3)).perform();
		d.quit();
		
	}

}
