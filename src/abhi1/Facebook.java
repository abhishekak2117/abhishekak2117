package abhi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		   
        // declaration and instantiation of objects/variables  
        System.setProperty("webdriver.chrome.driver", "C:\\app\\Abhishek\\Newfolder\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();  
          
       // Launch website  
        driver.navigate().to("https://www.facebook.com/");  
              
        // Click on the search text box and send value  
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("javatpoint tutorials");  
              
        // Click on the search button  
       driver.findElement(By.name("btnK")).click();  
	// TODO Auto-generated method stub
		System.out.println("abhishek");

	}

}
