package UserClient;

import UserClient.Create.CreateUserRequestBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class users {
    public Response createUser(CreateUserRequestBody body) {
        return given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 7af240fb7b557b1314869bc519303f4e79eb90f287818ef0c9b01eef8e85f17a")
                .body(body)
                .when()
                .post("https://gorest.co.in/public/v1/users");
    }
    public Response getAllUsers() {
        return given()
                .when()
                .get("https://gorest.co.in/public/v1/users");
    }
}
