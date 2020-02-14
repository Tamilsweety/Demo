package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tammy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jar\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.amazon.in/");

	}

}
