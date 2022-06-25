package api.stepdef;

import io.cucumber.java.en.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ValidationStep {

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("response structure should match json schema {string}")
    public void responseStructureShouldMatchJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }
}
