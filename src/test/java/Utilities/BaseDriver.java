package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriver getDriver() {

        // extend report türkçe dil sorunu olmaması için eklendi
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver == null) { // 1 kere çalışssın
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) { // dolu ise, boş değilse
            driver.quit();
            driver = null;
        }
    }

    public static void waitDriver(int sn)
    {
        try {
            Thread.sleep(5000*sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
