package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.RegisterPage;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void open(){
        registerPage.open();
    }
}
