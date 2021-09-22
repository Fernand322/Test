package runners.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{
    @Override
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver");
        //primero creo una instancia del navegador, en este caso para google chrome.
        driver = new ChromeDriver();
    }
}
