package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            closePreviousDrivers(); // Closes previously opened driver instances.
            Logger logger = Logger.getLogger(""); // Initializes a logger with an empty name.
            logger.setLevel(Level.SEVERE);  //Sets the logger's logging level to "SEVERE".
            driver = new ChromeDriver();  //Creates a new instance of ChromeDriver for browser automation.

            driver.manage().window().maximize();
            //Maximizes the browser window in Selenium WebDriver.

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            // Waits for a page to load completely, throws an exception if timeout is exceeded.

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           // Sets a global wait time for finding elements, prevents immediate failures.
        }
        return driver;
    }



    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            //Quits the WebDriver instance and releases resources.
        }
    }

    public static void closePreviousDrivers() {
        //Closes any previous instances of chromedriver.exe using a system command.
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}