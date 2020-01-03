package com.victoria.whatsapp_bot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
	public static void main(String[] args) throws InterruptedException {
		String contacto = "Samuel";
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://web.whatsapp.com/";
		driver.get(baseUrl);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@class='eiCXe']")).click();
		WebElement ser = driver.findElement(By.xpath("//input[@title='Buscar o empezar un chat nuevo']"));
		ser.click();
		ser.sendKeys(contacto + "\n");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.className("_3u328"));
		e.sendKeys("Prueba  \n");

		Thread.sleep(2000);
		driver.quit();
	}
}
