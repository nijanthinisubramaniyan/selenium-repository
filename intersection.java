package proj1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("nijanth+us664@amazon.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys("kindleda");
		driver.findElement(By.id("signInSubmit")).click();
	}

}
