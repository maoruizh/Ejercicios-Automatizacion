package co.com.empresamao.areait.advantageMobile.tasks;

import co.com.empresamao.areait.advantageMobile.userinterfaces.CreateAccountPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.empresamao.areait.advantageMobile.userinterfaces.CreateAccountPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.empresamao.areait.advantageMobile.Models.CreateUserModels;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class CreateUser implements Task {

    public CreateUser(List<CreateUserModels> user) {
        this.user = user;
    }

    private List<CreateUserModels> user;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.get(0).getUsername()).into(TXT_USERNAME),
                Enter.theValue(user.get(0).getEmail()).into(TXT_EMAIL),
                Enter.theValue(user.get(0).getPassword()).into(TXT_PASSWORD),
                Enter.theValue(user.get(0).getConfirmPassword()).into(TXT_CONFIRMPASSWORD),
                Enter.theValue(user.get(0).getFirstName()).into(TXT_FIRSTNAME),
                Enter.theValue(user.get(0).getLastName()).into(TXT_LASTNAME)
        );

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = BrowseTheWeb.as(actor).getDriver().manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);

        try {
            new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver())
                    .press(pointOptionEnd)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionStart)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        actor.attemptsTo(
                Enter.theValue(user.get(0).getPhoneNumber()).into(TXT_PHONE),
                Click.on(TXT_COUNTRY)
        );

        try {
            new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver())
                    .press(pointOptionEnd)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionStart)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }
        actor.attemptsTo(
                Enter.theValue(user.get(0).getCountryBelgium()).into(TXT_COUNTRY_BELGIUM),//está mapeado con el selector de argentina
                Enter.theValue(user.get(0).getState()).into(TXT_STATE),
                Enter.theValue(user.get(0).getAddress()).into(TXT_ADDRESS),
                Enter.theValue(user.get(0).getCity()).into(TXT_CITY),
                Enter.theValue(user.get(0).getZip()).into(TXT_ZIP)
        );
    }

    public static CreateUser create(List<CreateUserModels> user) {
        return instrumented(CreateUser.class, user);
    }
}
