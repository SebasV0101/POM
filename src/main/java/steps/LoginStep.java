package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    @Step
    public void openBrowser(){
        loginPage.open();
    }

    @Step
    public void enterCredentials(){
        registerPage.getDriver().findElement("loginPage.elementoMapeadoGet"())
        .sendKeys("textoAEnviar")

        registerPage.getDriver().findElement("loginPage.elementoMapeadoGet"())
        .click()
    }

    @Step
    public void validationName (){
        Assert.assertThat(registerPage.getDriver().findElement(RegisterPage.elementoGet).isDisplayed(), Matchers.is(true));
    }
}
