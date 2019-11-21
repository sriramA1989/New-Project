package Org.test.day1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;


public class Browsers {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriRamPrasath A\\eclipse-workspace\\Day 1\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.quit();
}
}
