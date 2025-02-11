package com.learning.com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		implicitWait();
		explicitWait();

	}

	private static void explicitWait() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://staging-zoodmall-uz.zoodmall.com/en/");
		driver.findElement(By.name("z")).sendKeys("Zood"+Keys.ENTER);
		
		WebDriver firstResult = new WebDriverWait(driver,10)
				.until(ExceptedConditions.elementToBeClickable(By.xpath("//a/href")));
		
		System.out.println(firstResult.getPageSource());
						
		
		
		
	}

	private static void implicitWait() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://staging-zoodmall-uz.zoodmall.com/en/");
		System.out.println(driver.getPageSource());
		
		
	}

}
