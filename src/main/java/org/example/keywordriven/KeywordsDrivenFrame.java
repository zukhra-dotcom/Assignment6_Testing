package org.example.keywordriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KeywordsDrivenFrame {
    static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\fatiu\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    public static void navigateToWebsite(){
        driver.navigate().to("https://ticketon.kz/");
    }

    public static void clickSearch(){
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
    }
}
