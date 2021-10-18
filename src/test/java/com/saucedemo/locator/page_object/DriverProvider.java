package com.saucedemo.locator.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverProvider {

    private static WebDriver driver = null;

    public static WebDriver get(){
        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            // ChromeDriver is just AWFUL because every version or two it breaks unless you pass cryptic arguments
//AGRESSIVE: options.setPageLoadStrategy(PageLoadStrategy.NONE); // https://www.skptricks.com/2018/08/timed-out-receiving-message-from-renderer-selenium.html
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://www.saucedemo.com/");
        }
        return driver;
    }

    public static void quit(){
        driver.quit();
        driver = null;
    }
}
