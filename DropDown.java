package day4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Dropdown.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		    WebElement listBox1 = driver.findElement(By.id("dropdown1"));
			Select listBox1Select = new Select(listBox1);
			listBox1Select.selectByIndex(1);

			 
			WebElement listBox2 = driver.findElement(By.name("dropdown2"));
			Select listBox2Select = new Select(listBox2);
			listBox2Select.selectByVisibleText("appium");

			 
			WebElement listBox3 = driver.findElement(By.id("dropdown3"));
			Select listBox3Select = new Select(listBox3);
			listBox3Select.selectByValue("3");

			 
			WebElement listBox4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
			Select listBox4Select = new Select(listBox4);
			listBox4Select.selectByIndex(3);
			int size = listBox4Select.getOptions().size();
			System.out.println("The size of the listbox is :" + size);

		 
			driver.findElement(By.xpath("(//section[@class='innerblock']//select)[5]")).sendKeys("Loadrunner");

			 
			WebElement listBox6 = driver.findElement(By.xpath("(//section[@class='innerblock']//select)[6]"));
			Select listBox6Select = new Select(listBox6);
			listBox6Select.selectByValue("1");
			listBox6Select.selectByValue("2");
			listBox6Select.selectByValue("3");


	}

}
