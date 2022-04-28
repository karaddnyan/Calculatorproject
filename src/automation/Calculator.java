
 
package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.calculator.net/");
//		Multiplcation
        driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
        driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='×']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
        List<WebElement> multiplication=driver.findElements(By.id("sciOutPut"));
        for(WebElement i:multiplication)
        {
        	System.out.println("Multiplication is:" +i.getText());
        	
        }
        
        driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='AC']")).click();
//        Division
        driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='/']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
         List<WebElement> division=driver.findElements(By.id("sciOutPut"));
         for(WebElement i:division)
         {
         	System.out.println("Divison is:"+ i.getText());
         	
         }
         
         driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='AC']")).click(); 
         
//         Addition
         driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='–']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
         driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
         List<WebElement> addition=driver.findElements(By.id("sciOutPut"));
         for(WebElement i:addition)
         {
         	System.out.println("additon is:"+ i.getText());
         	
         }
         
         driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='AC']")).click();
//         Subtraction
         driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
         driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
         driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
         List<WebElement> subtraction=driver.findElements(By.id("sciOutPut"));
         for(WebElement i:subtraction)
         {
         	System.out.println("subtraction is:"+ i.getText());
         	
         }
         
         driver.findElement(By.xpath("//span[@class='sciop']//following::span[text()='AC']")).click();
         driver.close();
         
         
        
        
        
	}

}
