package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUsersTest extends BaseTest {

    @Test
    public void getAllUsers() {
        given()
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("size()", equalTo(10));
    }

    @Test
    public void getSingleUser() {
        given()
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("username", equalTo("Bret"));
    }
}
