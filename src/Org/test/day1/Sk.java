package Org.test.day1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sk {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SriRamPrasath A\\eclipse-workspace\\Day 1\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement user = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    js.executeScript("arguments[0].setAttribute('value','sriram.prasath166@gmail.com')", user);
	    WebElement password = driver.findElement(By.id("pass"));
	    js.executeScript("arguments[0].setAttribute('value','ram123')", password);
	    Object obj = js.executeScript("return arguments[0].getAttribute('value')", user);
	    String S = (String)obj;
	    System.out.println(S);
	    Object obj1 = js.executeScript("return arguments[0].getAttribute('value')", password);
	    String S1 = (String)obj1;
	    System.out.println(S1);
	    WebElement logbtn = driver.findElement(By.id("loginbutton"));
	    js.executeScript("arguments[0].click()", logbtn);
}
}