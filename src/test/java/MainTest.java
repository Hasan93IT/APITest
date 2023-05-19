import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MainTest {




    @Test
    public void TestAPI02() {
        given().
                get("https://www.amjis.com/").
                then().
                statusCode(200);
    }
}
