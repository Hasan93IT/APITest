import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MainTest {


    @Test
    public void TestAPI1() {
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200);
    }

    @Test
    public void TestAPI02() {
        given().
                get("https://www.amjis.com/").
                then().
                statusCode(200);
    }
}
