package abhi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declaration and instantiation of objects/variables  
        System.setProperty("webdriver.chrome.driver", "C:\\app\\Abhishek\\Newfolder\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();  
          
       // Launch  Facebook website  
        driver.navigate().to("https://www.instagram.com/");  
              
        // Enter Email address or phone number 
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("javatpoint tutorials");  
      // Enter Password
        
        //click on Log In button and verify get browser title 

	}

}
