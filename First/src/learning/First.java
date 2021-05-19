package learning;

import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\keert\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String baseUrl="http://demo.guru99.com/test/newtours/";
			String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	     // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Chrome
	        //driver.close();
	       
	}

}
