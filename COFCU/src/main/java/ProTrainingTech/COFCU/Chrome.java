package ProTrainingTech.COFCU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali Nouman\\eclipse-workspace\\COFCU\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.ebay.com/deals");
//Thread.sleep(6000);
driver.navigate().refresh();
//Thread.sleep(6000);
driver.navigate().back();
driver.navigate().forward();
driver.manage().window().maximize();
driver.manage().window().fullscreen();
String windowofhandle=driver.getWindowHandle();
System.out.println(windowofhandle);
String currenturlwindow=driver.getCurrentUrl();
System.out.println(currenturlwindow);
//Thread.sleep(6000);
WebElement searchbutton=driver.findElement(By.id("<label for=\"gh-ac\" class=\"gh-ar-hdn\">Enter your search keyword</label>"));
searchbutton.click();

//driver.close();
	}

}
