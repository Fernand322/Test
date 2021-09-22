package runners.browser_manager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    //variable tipo WebDriver.
    protected WebDriver driver;
//meotodo abstracto que van a implementar las clases hijas.
    protected abstract void createDriver();
//metodo para crear la instancia del navegador
    public void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
    //metodo para cerrar la instancia del navegador
    public WebDriver getDriver(){
        if (driver == null){
            createDriver();
        }
        return driver;
    }

}
