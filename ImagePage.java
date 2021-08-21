package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

	
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[contains (@src, '/home.png')]")).click();
		driver.navigate().back();


		WebElement brokenImg = driver.findElement(By.xpath("//img[contains(@src , 'abcd.jpg')]"));
		String size = brokenImg.getAttribute("naturalWidth");

		if (size.equals("0"))
			System.out.println(" The image is broken");
		else
			System.out.println(" The image is not broken");


	}

}
