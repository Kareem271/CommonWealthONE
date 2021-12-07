package ProTrainingTech.COFCU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment {
	static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Nouman\\eclipse-workspace\\COFCU\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.facebook.com");
driver.manage().window().maximize();

driver.findElement(By.id("email")).sendKeys("Enter Your User Name");
WebElement pass =driver.findElement(By.id("pass"));
pass.click();
pass.sendKeys("12345889");
driver.findElement(By.name("login")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Forgot password?")).click();
driver.findElement(By.linkText("Cancel")).click();
driver.findElement(By.linkText("Create new account")).click();
WebElement First=driver.findElement(By.name("firstname"));
First.click();
First.sendKeys("Ali");
WebElement Last=driver.findElement(By.name("lastname"));
Last.click();
Last.sendKeys("Nouman");
WebElement mobilNo = driver.findElement(By.name("reg_email__"));
mobilNo.click();
mobilNo.sendKeys("123456789");
WebElement password = driver.findElement(By.id("password_step_input"));
password.click();
password.sendKeys("**********");
WebElement month=driver.findElement(By.id("month"));


Select select= new Select(month);
select.selectByVisibleText("Dec");

WebElement day=driver.findElement(By.id("day"));
Select selectday= new Select(day);
selectday.selectByVisibleText("15");


WebElement year=driver.findElement(By.id("year"));
Select selectyear= new Select(year);
selectyear.selectByVisibleText("2021");







Thread.sleep(4000);
driver.findElement(By.linkText("Already have an account?")).click();








	}

}
