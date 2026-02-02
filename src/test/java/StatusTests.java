import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;



public class StatusTests {



    @Test
    void checkTotal20() {
        get("https://selenoid.autotests.cloud/status")
                .then()
                .body("total", Is.is(5))
                .log().all();














    }
}
