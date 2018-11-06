package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriveProgram2 {
	
	public WebDriver driver;
	
	public void setup() {
		
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\DriverFiles\\geckodriver.exe");
		driver = new FirefoxDriver();*/
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
/*		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\DriverFiles\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();*/
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.navigate().to("https://www.facebook.com/");
		
		//closing window
		
		//driver.close();
		
		
		
	}
	
	
	public void faceBookCreateAccount() {
		
		driver.findElement(By.id("u_0_g")).clear();
		driver.findElement(By.id("u_0_g")).sendKeys("sachin");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("tendulkar");
		
		
		driver.findElement(By.id("u_0_l")).clear();
		driver.findElement(By.id("u_0_l")).sendKeys("9874563210");
		
		
		driver.findElement(By.id("u_0_s")).clear();
		driver.findElement(By.id("u_0_s")).sendKeys("test@1234");
		
		WebElement wb = driver.findElement(By.id("u_0_s"));
		wb.clear();
		wb.sendKeys("test@7890");
		
		
		//driver.findElement(By.id("u_0_3")).click();
		
		//driver.findElement(By.name("websubmit")).click();
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("17");
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(0);

		new Select(driver.findElement(By.id("day"))).selectByValue("11");
		
		
		new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(7);
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@href='/lite/']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("//input[@aria-describedby='js_c']")).clear();
		
		String headerText = driver.findElement(By.className("_5iyx")).getText();
		System.out.println(headerText);
		
		String cookies = driver.findElement(By.className("_58mv")).getText();
		System.out.println(cookies);
		
		
		String uname= driver.findElement(By.xpath("//label[@for='email']")).getText();
		System.out.println(uname);
		
		
		
		
		/*String forgotHeader = driver.findElement(By.partialLinkText("Forgotten")).getText();
		System.out.println(forgotHeader);
		
		
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);*/
		
		
		
	
	}
	
	
	
	public static void main(String[] args) {

		WebDriveProgram2 wp = new WebDriveProgram2();
		wp.setup();
		wp.faceBookCreateAccount();
		
	}

}
