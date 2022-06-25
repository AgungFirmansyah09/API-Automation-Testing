package api.stepdef;

import api.services.userService;
import io.cucumber.java.en.When;

public class UserStepdef {
    userService user = new userService();
    @When("user send POST Create user request to server")
    public void userSendPOSTCreateUserRequestToServer() {
        user.POSTCreateUser();
    }

    @When("user send PUT Update user request to server")
    public void userSendPUTUpdateUserRequestToServer() {
        user.PUTUpdateUser();
    }


    @When("user send  GET list user request to server")
    public void userSendGETListUserRequestToServer() {
        user.GETListUser();
    }

    @When("user send GET Single user request to server")
    public void userSendGETSingleUserRequestToServer() {
        user.GETSingleUser();
    }

    @When("user send DELETE user request to server")
    public void userSendDELETEUserRequestToServer() {
        user.DELETEuser();
    }
}
