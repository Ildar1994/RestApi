import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static net.bytebuddy.matcher.ElementMatchers.is;


public class StatusTests {

    @Test
    void checkTotal20() {

        get("https://selenoid.autotests.cloud/status")
                .then()
                .body("total", is(20));







    }
}
