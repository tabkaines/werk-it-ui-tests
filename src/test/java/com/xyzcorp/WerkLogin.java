package com.xyzcorp;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
public class WerkLogin {


    //https://staging.tiered-planet.net/werk-it-back-end/login/admin/pilot
    @Test
    public void testSuccesLogin() {
        given()
                .relaxedHTTPSValidation()
                .when()
                .get("https://staging.tiered-planet.net/werk-it-back-end/login/admin/pilot")
                .then()
                .assertThat()
                .statusCode(200);
    }
    @Test
    public void testFailLogin() {
        given()
                .relaxedHTTPSValidation()
                .when()
                .get("https://staging.tiered-planet.net/werk-it-back-end/login/admin/pilo")
                .then()
                .assertThat()
                .statusCode(401);
        // Assert that correct status code is returned.
    }
}