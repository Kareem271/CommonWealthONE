package ProTrainingTech.COFCU;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SearchBar {
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Nouman\\eclipse-workspace\\COFCU\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		//WebElement searchto=driver.findElement(By.xpath("driver=new ChromeDriver();\r\n"+ "driver.navigate().to(\"https://www.facebook.com\");"));
		//searchto.click();
		WebElement phonenumberfield=driver.findElement(By.xpath("//input[@Email or phone number]"));
	     phonenumberfield.sendKeys("CommonWealth One FCU");
	}

}
