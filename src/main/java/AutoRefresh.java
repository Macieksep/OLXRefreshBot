import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutoRefresh {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        // OPCJE DLA STANDARDOWEGO MIEJSCA GOOGLE CHROME NA DYSKU DLA WINDOWSA!!!
            // Pozwala zachować ustawienia profilu bez każdorazowego logowania :)
        options.addArguments("--profile-directory=<YOUR PROFILE>");
        options.addArguments("--user-data-dir=C:/Users/<USERNAME>/AppData/Local/Google/Chrome/");

        WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.olx.pl/d/mojolx/?size=1000");

        Thread.sleep(5000);

        List<WebElement> buttons = driver.findElements(By.className("css-176xeu"));

        for (WebElement x:
             buttons) {

            if (x.getText().equals("Odśwież za darmo")){
                try {
                    x.click();
                } catch (Exception e){

                }
            }

        }
        System.out.println("done :)");
        driver.close();

    }
}

/*

    Title: OLX Free Auto Refresh
    Description: Free auto refresh for your sales
    Author: Maciej Sepeta

    External Libraries: Selenium
    Used website: https://www.olx.pl/

 */