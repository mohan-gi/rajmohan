package CortexConsultants;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {
	public static void konicaMinolta() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace1\\maven\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// launch URL
		driver.get("https://www.google.com");

		// wait for webdriver
		WebDriverWait wb = new WebDriverWait(driver, 20);
		WebElement gmail = driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a"));
		wb.until(ExpectedConditions.visibilityOf(gmail));
		gmail.click();
		Thread.sleep(1000);
       
       
		
		WebElement clickGmail = driver
				.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]/a/div/span"));
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		username.sendKeys("rammohanraj7@gmail.com");
		WebElement Next = driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]"));
		Next.click();
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        pass.sendKeys("Mohanece");
        WebElement Next1 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
        Next1.click();
        Thread.sleep(4000);
        
        boolean logo = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img")).isDisplayed();
        
        if (logo==true) {
			System.out.println("logo is displayed");
		}else {
			System.out.println("log is nnot displayed");
		}
        
        
		driver.close();

	}

	public static void main(String[] args) throws Throwable {
		Example x = new Example();
		x.konicaMinolta();

	}

}
