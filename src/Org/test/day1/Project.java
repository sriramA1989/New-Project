package Org.test.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Project {

public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SriRamPrasath A\\eclipse-workspace\\Day 1\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.greenstechnologies.in/");
    WebElement BtnCourse = driver.findElement(By.xpath("//*[@id=\"main-menu-item-551\"]/a"));
    Actions acc = new Actions(driver);
    acc.moveToElement(BtnCourse).perform();
    WebElement Selenium = driver.findElement(By.xpath("//*[@id=\"vibe-mega-cat_posts13\"]/ul/li[2]/a"));
    Actions abc = new Actions(driver);
    abc.moveToElement(Selenium).perform();
    WebElement java = driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div[2]/nav/ul/li[3]/ul/li/div/ul/li[2]/div/div/div/div[1]/a/div/img"));
    java.click();
    driver.quit();
        driver.quit();
    driver.quit();
}
}

