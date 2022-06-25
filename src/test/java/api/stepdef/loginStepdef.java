package api.stepdef;

import api.services.loginService;
import io.cucumber.java.en.When;

public class loginStepdef {
    loginService login = new loginService();
    @When("user send user send POST success login request to server")
    public void userSendUserSendPOSTSuccessLoginRequestToServer() {
        login.POSTLoginSuccessfully();
    }

    @When("user send user send POST invalid login request to server")
    public void userSendUserSendPOSTInvalidLoginRequestToServer() {
        login.POSTLoginUnsuccessfully();
    }
}
