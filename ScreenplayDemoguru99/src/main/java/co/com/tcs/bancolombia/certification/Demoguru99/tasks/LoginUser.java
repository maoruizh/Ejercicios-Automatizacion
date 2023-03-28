package co.com.tcs.bancolombia.certification.Demoguru99.tasks;

import co.com.tcs.bancolombia.certification.Demoguru99.models.LoginUserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static co.com.tcs.bancolombia.certification.Demoguru99.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {
//Después de esta línea se importa el método
    public LoginUser(List<LoginUserModel> userModelList) {
        this.userModelList = userModelList;
    }

    private List<LoginUserModel> userModelList;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICN_PROJECT_BANK),
                Enter.theValue(userModelList.get(0).getUserID()).into(ICN_LOGIN_USER_ID),
                Enter.theValue(userModelList.get(0).getPassword()).into(ICN_LOGIN_PASSWORD),
                Click.on(BTN_LOGIN_SIGN_IN)
        );
    }

    public static LoginUser loginUser(List<LoginUserModel> userModelList) {

        return instrumented(LoginUser.class,userModelList);
    }
}

