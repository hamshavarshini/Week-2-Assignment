package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 	
		// filling the form
		driver.findElement(By.name("UserFirstName")).sendKeys("hamsha");
		driver.findElement(By.name("UserLastName")).sendKeys("varshini");
		
		driver.findElement(By.name("UserEmail")).sendKeys("hamshavarshini@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Test Leaf");
		
		WebElement jt= driver.findElement(By.name("UserTitle"));
		Select jt1 = new Select(jt);
		jt1.selectByValue("IT_Manager_AP");
		
		WebElement emp= driver.findElement(By.name("CompanyEmployees"));
		Select emp1 = new Select(emp);
		emp1.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("12345678910");
		
		WebElement Country= driver.findElement(By.name("CompanyCountry"));
		Select c1 = new Select(Country);
		c1.selectByValue("IN");
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();		

	}

}
