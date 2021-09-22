package runners.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver/geckodriver");
        //primero creo una instancia del navegador en este caso para Firefox.
        driver = new FirefoxDriver();
    }
}
