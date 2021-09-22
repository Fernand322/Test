package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import runners.browser_manager.DriverManager;
import runners.browser_manager.DriverManagerFactory;
import runners.browser_manager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static int numberOfCase =0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Se esta ejecutanto el escenario nro:"+numberOfCase);
        driverManager= DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        //Se levanta la ventana instancia.
        driver.get("https://imalittletester.com/");
        //Permite maximizar la ventana
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("Se ejecuto correctamente el escenario nro:"+numberOfCase+"de forma correcta");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
