package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreatePostTest extends BaseTest {

    @Test
    public void createPost() {
        String requestBody = "{\r\n"
        		+ "              \"title\": \"foo\",\r\n"
        		+ "              \"body\": \"bar\",\r\n"
        		+ "              \"userId\": 1\r\n"
        		+ "            }";

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("/posts")
        .then()
            .statusCode(201);
    }
}
