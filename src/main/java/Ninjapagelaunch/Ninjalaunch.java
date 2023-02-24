package Ninjapagelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ninjalaunch {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\workspace\\Helloselenium\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();

	//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
	options.setAcceptInsecureCerts(true);
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://tutorialsninja.com/demo/index.php");
	try {
		Thread.sleep(50000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//WebElement buttonElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='dropdown-menu']")));
	//buttonElement.click();	
	driver.findElement(By.xpath("//div[@class='btn-group']")).click();
	WebElement changecurrency1= driver.findElement(By.xpath("//span[text()='Currency']/../..//button[@name='EUR']"));
	changecurrency1.click();
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//System.out.println("waiting for visibale");
	//WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='dropdown-menu']/li[1]/button[@name='EUR']")));
	//System.out.println("--------"+buttonElement.getAttribute("name")+"---"+buttonElement.getText());
	
	//buttonElement.click();
	
	
	
}

}


