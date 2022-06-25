package api.services;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class registerService {
    private static final String API_BASEURL = "https://reqres.in";

    public void POSTRegisterSuccessfully () {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "pistol");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/api/register");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void POSTRegisterUnsuccessfully (){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "Agung Firmansyah");
        bodyJson.put("password", "Agung09");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/api/register");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }
}

