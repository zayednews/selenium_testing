//import java.util.concurrent.TimeUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

//import org.openqa.selenium.*;

public class webdriverdemo {
   public static void main(String[] args) {
   
	  //System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\MIT testing\\geckodriver\\geckodriver.exe");
      //WebDriver driver = new FirefoxDriver();
      
      System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\MIT testing\\chromedriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
    //Launch website
      driver.manage().window().maximize();      
      driver.navigate().to("https://www.chawkbazar.com.bd/");
      
      // Enter value 10 in the first number of the percent Calculator
      //driver.findElement(By.id("cpar1")).sendKeys("10");
      
      driver.findElement(By.xpath("//*[@id='s']")).sendKeys("Macaw mix ");
      driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"product-4901\"]/div[2]/form/button")).click();
      
      driver.findElement(By.xpath("//*[@id='s']")).sendKeys("Deli-Nature Egg Food");
      driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"product-4976\"]/div[2]/form/button")).click();
      
      //driver.findElement(By.xpath("//*[@id=\"pt_woocommerce_widget_cart-1\"]/div/div/div[2]/div/p[2]/a[1]")).click();
      
      driver.navigate().to("https://www.chawkbazar.com.bd/cart-2/");
    
      // Enter value 50 in the second number of the percent Calculator
      //driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
      //driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/table/tbody/tr[3]/td/strong/span")).getText();

      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}