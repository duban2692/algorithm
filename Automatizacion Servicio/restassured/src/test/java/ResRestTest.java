/**
 * Consumo básico de servicio
 *
 * @author duban@tyba.com.co
 */


import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class ResRestTest {


    @Test
    public void LoginTest() {

        RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}'")
                .post("https://restful-booker.herokuapp.com/auth\n")
                .then()
                .log()
                .all()
                .extract()
                .asString();

    }
}
