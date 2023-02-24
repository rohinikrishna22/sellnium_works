package testesuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JuiceShop {
	
	
	public static WebDriver driver=new ChromeDriver();
	
	public   void register() throws InterruptedException {
	
		PageFactory.initElements(driver,this);
		driver.findElement(By.id("emailControl")).sendKeys("check1234@yahoo.com");
		driver.findElement(By.id("passwordControl")).sendKeys("JabberMsg");
		driver.findElement(By.id("repeatPasswordControl")).sendKeys("JabberMsg");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println("click the security  dropDown");
		Thread.sleep(30000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-0")));
		driver.findElement(By.xpath("//*[@id='mat-select-value-1']/span/span")).click();
		driver.findElement(By.id("securityAnswerControl")).sendKeys("All That Glitters is not gold ");
	    driver.findElement(By.xpath("//*[@id='registerButton']")).click();
	    
	   	
}
	
	public  void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("check123@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("JabberMsg");
		Thread.sleep(20000);
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Successfully logged in ");
	}
	
	public  void addToBasket() throws InterruptedException {
		driver.findElement(By.xpath(
				"//app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button")).click();
		WebElement nextPage =driver.findElement(By.xpath("//app-search-result/div/div/mat-paginator/div/div/div[2]/button[2]"));//Apple juice
		
		Actions action = new Actions(driver);
		action.scrollToElement(nextPage).click(nextPage).perform();
		driver.findElement(By.xpath("//app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[5]/div/mat-card/div[2]/button")).click();//OWASP Juice Shop
		driver.findElement(By.xpath("//mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//app-basket/mat-card/app-purchase-basket/mat-table/mat-row[1]/mat-cell[3]/button[2]")).click();
		driver.findElement(By.xpath("//app-basket/mat-card/app-purchase-basket/mat-table/mat-row[2]/mat-cell[3]/button[2]")).click();
	}
	
	
	
	 
	 
	 
	
	
  public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Helloselenium\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setAcceptInsecureCerts(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://juice-shop.herokuapp.com/#/login"); //go to the search and add to basket page
		Thread.sleep(30000);
	    JuiceShop JS= new JuiceShop();
		//JS.register();
	    JS.login();
	    Thread.sleep(30000);
	    JS.addToBasket();
	    }	
	
}
