package api.services;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class loginService {
    private static final String API_BASEURL = "https://reqres.in";

    public void POSTLoginSuccessfully (){
        JSONObject bodyJson =  new JSONObject();

        bodyJson.put("email","eve.holt@reqres.in");
        bodyJson.put("password","cityslicka");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/api/login");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }


    public void POSTLoginUnsuccessfully (){
        JSONObject bodyJson =  new JSONObject();

        bodyJson.put("email","peter@klaven");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/api/login");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }
}
