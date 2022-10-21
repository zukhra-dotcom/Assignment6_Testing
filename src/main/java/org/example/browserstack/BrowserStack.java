package org.example.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;

public class BrowserStack {
    public static final String USERNAME = "umarovazukhra_Vjksi4";
    public static final String AUTOMATE_KEY = "zs3ybe7pn3nMbExorTB8";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception{
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("browserName", "Edge");
        capabilities.setCapability("browserVersion", "latest");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "Windows");
        browserstackOptions.put("osVersion", "10");
        browserstackOptions.put("projectName", "Test");
        browserstackOptions.put("buildName", "Build");
        browserstackOptions.put("sessionName", "Test1");
        browserstackOptions.put("local", "false");
        browserstackOptions.put("seleniumVersion", "3.5.2");
        capabilities.setCapability("bstack:options", browserstackOptions);

        WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Software Quality Assurance and Testing");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();
    }
}
