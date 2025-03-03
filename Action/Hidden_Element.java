package Action;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/r.php");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor)d;
		Thread.sleep(1500);
		js.executeScript("document.getElementById('custom_gender').value='MALE'");
		Thread.sleep(1500);
		js.executeScript("(document.getElementsByName('reg_email__'))[0].value='6374228072'");
		Thread.sleep(1500);
		d.quit();
	

	}

}
