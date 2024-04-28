package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Miniprojectjavascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317693\\eclipse-workspace\\CSDQEA24SD002\\Browser\\msedgedriver.exe");	 
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stqatools.com/demo/Alerts.php");
		System.out.println("Current URL: " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//generate alert "hello world" by clicking on "basic alert"
		Thread.sleep(3000);
		WebElement btn=driver.findElement(By.id("btnAlert"));
		btn.click();
		Thread.sleep(3000);
		
		WebElement btnClse=driver.findElement(By.xpath("//*[@id='ezAlerts-footer']/button"));
		btnClse.click();
		
		//Navigate to diff webpage
		Thread.sleep(5000);
		driver.navigate().to("https://stqatools.com/demo/Register.php");   
	    
	    //Title of the page   
	    System.out.println("Title of the Webpage:" + driver.getTitle());
	    System.out.println("After navigation Current URL is: " + driver.getCurrentUrl());
	    
	    //Name Of the person 
	    Thread.sleep(3000);
	    WebElement name = driver.findElement(By.name("name"));
	    name.sendKeys("Amol");
	    System.out.println("Name:"+name.getAttribute("value"));
	    
	    //Address of the person 
	    Thread.sleep(2000);
	    WebElement address = driver.findElement(By.name("address"));
	    address.sendKeys("Mumbai");
	    System.out.println("Address:"+name.getAttribute("value"));
	    
	    //Gender
	    WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']")); 
	    System.out.println("Gender: male");
	   male_rd.click();
	   System.out.println(male_rd.isSelected());  //true
	   
	 //run the js code 
       Thread.sleep(2000);
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,400)");
       
	   //hobby 
	   Thread.sleep(2000);
	   WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Traveling']"));
	   checkbox.click();
       System.out.println(checkbox.getText());
	    
	     //country
       Thread.sleep(2000);
	     WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
         Select drpCountry=new Select(drpCountryEle);
         drpCountry.selectByVisibleText("India");
         WebElement selectedOption = drpCountry.getFirstSelectedOption();
         System.out.println("Selected Country: " + selectedOption.getText());       
         
         //city 
         Thread.sleep(2000);
         WebElement drpCityEle=driver.findElement(By.xpath("//select[@id='city']"));
         Select drpCity=new Select(drpCityEle);
         drpCity.selectByVisibleText("Mumbai");
         WebElement selectedOption2 = drpCity.getFirstSelectedOption();
         System.out.println("Selected City: " + selectedOption2.getText());
         
         
        //date 
         Thread.sleep(2000);
         WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
         dob.sendKeys("08/14/2001");

         // Get the entered date and print it
         String enteredDate = dob.getAttribute("value");
         System.out.println("Entered Date: " + enteredDate);
         
         WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
         button.click();
        
         Thread.sleep(3000);
      driver.quit();
         
	}

}
