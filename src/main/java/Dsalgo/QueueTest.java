package Dsalgo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class QueueTest {
	
	public static WebDriver driver=new ChromeDriver();

	public   void register(){
		PageFactory.initElements(driver,this);
		 driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")).click();
		 driver.findElement(By.id("id_username")).sendKeys("Dsnumpy");
		 driver.findElement(By.id("id_password1")).sendKeys("abcd123!");
		 driver.findElement(By.id("id_password2")).sendKeys("abcd123!");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/div/a")).click();
	
	}
	
	public  void login() 
	{
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		 driver.findElement(By.id("id_username")).sendKeys("Dsnumpy");
		 driver.findElement(By.id("id_password")).sendKeys("abcd123!");
		 driver.findElement(By.id("submit")).click();
		System.out.println("Successfully logged in ");
	}
		
		
	
	
	
	
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://dsportalapp.herokuapp.com/home");
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Helloselenium\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setAcceptInsecureCerts(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://dsportalapp.herokuapp.com/home");
	    Thread.sleep(3000);
	    QueueTest test = new QueueTest();
	    //test.register();
	    test.login();
	   //test.Username();
	   //test.Password();
	
	
	
	}
	    
	
      

}
	
	
	
	
	
	
	
	
	
	
	
	