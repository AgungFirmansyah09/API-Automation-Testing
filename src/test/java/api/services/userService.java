package api.services;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class userService {
    private static final String API_BASEURL = "https://reqres.in";

    public void POSTCreateUser (){
        JSONObject bodyJson =  new JSONObject();

        bodyJson.put("name","morpheus");
        bodyJson.put("job","leader");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/api/users");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void PUTUpdateUser (){
        JSONObject bodyJson =  new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "zion resident");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/api/users/2");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void GETListUser (){
        Response response = SerenityRest.given()
                .get(API_BASEURL + "/api/users?page=2");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void GETSingleUser (){
        Response response = SerenityRest.given()
                .get(API_BASEURL + "/api/users/2");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void DELETEuser (){
        Response response = SerenityRest.given()
                .delete(API_BASEURL + "/api/users/2");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }


}
