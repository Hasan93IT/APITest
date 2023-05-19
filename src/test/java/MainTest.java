import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MainTest {


    @Test
    public void TestMainSideDeutsch() {
        given().
                get("https://www.amjis.com").
                then().
                statusCode(200);
    }

    @Test
    public void TestMainSideEnglish() {
        given().
                get("https://www.amjis.com/?language=en").
                then().
                statusCode(200);
    }

    @Test
    public void TestMainSideContactDE() {
        given().
                get("https://www.amjis.com/contact.php?language=de").
                then().
                statusCode(200);
    }

    @Test
    public void TestMainSideContactEN() {
        given().
                get("https://www.amjis.com/contact.php?language=en").
                then().
                statusCode(200);
    }
}
