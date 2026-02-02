import io.restassured.http.ContentType;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class LoginTests {

    @Test
    void succesfulLogin() {

        given()
                .body("{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}")
                .contentType(ContentType.JSON)

                        .when();
        post("https://reqres.in/api/login")

                .then()
                .body("context", Is.is("invalid_key"))
                .statusCode(200)
                .log().status();
}}
