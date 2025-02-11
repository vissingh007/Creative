package com.learning.com.learning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OyoHomePage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://staging-zoodmall-uz.zoodmall.com/en/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement signIn = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header[2]/div[1]/section/div/div[2]/div[2]/a/span"));
		signIn.click();
		WebElement emailButton = driver.findElement(By.xpath("//*[@id=\"tab-login\"]/span"));
		emailButton.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.click();
//		email.sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		//email.clear();
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pane-login\"]/div/form/div[2]/div/div[1]/input"));
		password.sendKeys("aqopl");
		Thread.sleep(2000);
		WebElement SignInn = driver.findElement(By.xpath("//*[@id=\"pane-login\"]/div/form/div[4]/div/button"));
		SignInn.click();
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class=\"el-form-item__error\"]"));
		String mess =errorMessage.getAttribute("textContent").trim();
		System.out.println(mess);
		
//		Alert alert = driver.switchTo().alert();
//		String text=alert.getText();
		
//		driver.quit();


	}

}
