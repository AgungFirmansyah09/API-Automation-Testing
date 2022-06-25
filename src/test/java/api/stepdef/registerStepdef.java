package api.stepdef;

import api.services.registerService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerStepdef {
    registerService Regis = new registerService();

    @When("user send user send POST success register request to server")
    public void POSTRegisterSuccessfully() {
        Regis.POSTRegisterSuccessfully();
    }


    @When("user send user send POST invalid register request to server")
    public void userSendUserSendPOSTInvalidRegisterRequestToServer() {
        Regis.POSTRegisterUnsuccessfully();
    }
}
