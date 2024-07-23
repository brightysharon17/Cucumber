package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Script;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Baseclass {
		
		public static WebDriver driver;
		public static Actions a;
		public static Robot r;
		public static Alert al;
		public static JavascriptExecutor js;
		public static Select s;
		
		public static void chromeBrowser() {
			
			 driver= new ChromeDriver();
		}
		
			public static void closebrowser() {
	           driver.close();
			}
			
			public static void passUrl(String url) {
			  driver.get(url);

			}
			
			public static void maxwindow() {
			
				driver.manage().window().maximize();
			}
			
			public  static String title() {
				String t1 = driver.getTitle();
				System.out.println(t1);
				return t1;
				
			}
			
			public static String crtUrl() {
				
		
			String url = driver.getCurrentUrl();
			System.out.println(url);
			return url;
		}
			
			public static void filtextpass(WebElement m1, String value) {
				m1.sendKeys(value);
			}
			
			public static void btnclick(WebElement c1){
	            c1.click();

			}
			
			public static void waitsline(int mil) throws InterruptedException {
				Thread.sleep(mil);

			}
			
			public static void dragDrop(WebElement sou, WebElement des) {
				Actions a = new Actions(driver);
				a.dragAndDrop(sou, des).perform();
			}
			
			public static void mousehovering(WebElement target) {
				a.moveToElement(target).perform();
			}
			
			public static void copy() throws AWTException{
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_C);
			}
			
			
			public static void paste() throws AWTException{
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);
			}
			
			public static void quitBrowser() {
				driver.quit();
			}
			
			public static void downKey(WebElement target, String value) {
				a.keyDown(Keys.SHIFT).sendKeys(target, value).perform();
			}
			
			public static void doubleClick(WebElement target) {
				a.doubleClick(target).perform();
			}
			
			public static void alertText() {
				Alert al = driver.switchTo().alert();
				String text = al.getText();
				System.out.println(text);
			}
		
			public static void handleAlert() {
				al.accept();
			}
			
		public static void takeScreenshot(String name) throws IOException{
				TakesScreenshot t = (TakesScreenshot)driver;
				File sou = t.getScreenshotAs(OutputType.FILE);
				File des = new File("C:\\Users\\shoran\\eclipse-workspace\\selenium\\screenshot\\"+name+".jpg");
				FileUtils.copyFile(sou, des);
			}
			
			public static void setValue(Script arg1,Object args) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('value', 'arg1')",args);
			}
			
			public static void selectValue(WebElement element, String value)
			{
				Select s= new Select(element);
				s.selectByValue(value);
			}
			
			public static void checkMultiple() {
				if(s.isMultiple()) {
					System.out.println("we can able to select more than one option");
				}else {
					System.out.println("we can select only one option");
				}
			}
			
			public static void selectText(String text) {
				s.selectByVisibleText(text);
				}
			
			public static void selectIndex(int index) {
				s.selectByIndex(index);
			}

			public static void allOptions() {
				List<WebElement> options = s.getOptions();
				for(int i=0;i<options.size(); i++) {
					WebElement eachOpt = options.get(i);
					System.out.println(eachOpt.getText());
				}
			}
			
			public static void deselectText(String text) {
				s.deselectByVisibleText(text);
			}
			
			public static void deselectValue(String value) {
				s.deselectByValue(value);
			}
			
			public static void retriveText(Object args) {
				js.executeScript("return arguments[0].getAttribute('value')", args);
			}
			
			public static void clickWebElement(Object args) {
				js.executeScript("argument[0].click()", args);
			}
			
			public static void scrollDown(Object args) {
				js.executeScript("arguments[0].scrollIntoView(true)", args);
		}
			
			public static void scrollUp(Object args) {
				js.executeScript("arguments[0].scrollIntoView(false)", args);
			}
			
			public static void parentId() {
				String windowHandle = driver.getWindowHandle();
			}
			
			public static void allWindowId() {
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
			}
			
			public static void tableData(WebElement table) {
				String text = table.getText();
				System.out.println(text);
			}
			
			public static void implicitWait(long seconds) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			}
			
			public static void explicitWait(long seconds) {
				WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(seconds));
				w.until(ExpectedConditions.alertIsPresent());
				al.accept();
			}
}





