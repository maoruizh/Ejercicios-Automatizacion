package co.com.empresamao.areait.advantageMobile.tasks;

import co.com.empresamao.areait.advantageMobile.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.empresamao.areait.advantageMobile.userinterfaces.CreateAccountPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.empresamao.areait.advantageMobile.Models.CreateUserModels;

import java.util.List;

public class CreateUser implements Task {

    public CreateUser(List<CreateUserModels> user) {
        this.user = user;
    }

    private List<CreateUserModels> user;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateAccountPage.TXT_USERNAME),
                Enter.theValue(user.get(0).getUsername()).into(TXT_USERNAME),
                Click.on(CreateAccountPage.TXT_EMAIL),
                Enter.theValue(user.get(0).getEmail()).into(TXT_EMAIL),
                Click.on(CreateAccountPage.TXT_PASSWORD),
                Enter.theValue(user.get(0).getEmail()).into(TXT_PASSWORD),
                Click.on(CreateAccountPage.TXT_CONFIRMPASSWORD),
                Enter.theValue(user.get(0).getEmail()).into(TXT_CONFIRMPASSWORD),
                Click.on(CreateAccountPage.TXT_FIRSTNAME),
                Enter.theValue(user.get(0).getEmail()).into(TXT_FIRSTNAME),
                Click.on(CreateAccountPage.TXT_LASTNAME),
                Enter.theValue(user.get(0).getEmail()).into(TXT_LASTNAME),
                Click.on(TXT_PHONE),
                Enter.theValue(user.get(0).getEmail()).into(TXT_PHONE),
                Click.on(TXT_COUNTRY),
                Enter.theValue(user.get(0).getEmail()).into(TXT_COUNTRY),
                Click.on(TXT_STATE),
                Enter.theValue(user.get(0).getEmail()).into(TXT_STATE),
                Click.on(TXT_ADDRESS),
                Enter.theValue(user.get(0).getEmail()).into(TXT_ADDRESS),
                Click.on(TXT_CITY),
                Enter.theValue(user.get(0).getEmail()).into(TXT_CITY),
                Click.on(TXT_ZIP),
                Enter.theValue(user.get(0).getEmail()).into(TXT_ZIP)


        );

    }

    public static CreateUser create(List<CreateUserModels> user) {
        return instrumented(CreateUser.class, user);
    }
}
