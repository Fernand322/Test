package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test {
    private WebDriver driver = Hooks.getDriver();
    @Given("^El usuario se encuntra en la pantalla Home de la pagina$")
    public void el_usuario_se_encuntra_en_la_pantalla_Home_de_la_pagina() throws Throwable {
        String title = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(title,driver.getTitle());
        //System.out.println(driver.getTitle());

    }

    @When("^Hace clic en el boton correspondiente$")
    public void hace_clic_en_el_boton_corresponiente() throws Throwable {
        WebElement title_botom = driver.findElement(By.id("menu-item-2008"));
        title_botom.click();
    }

    @Then("^Se redirecciona a la pantalla correspondiente$")
    public void se_redirecciona_a_la_pantalla_correspondiente() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono correctamente", pageTitleLocator.isDisplayed());
        Assert.assertEquals("Category: comics",pageTitleLocator.getText());
        //driver.quit(); Ahora se utiliza en la clase hook.

    }
}
