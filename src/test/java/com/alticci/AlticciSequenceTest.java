package com.alticci;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AlticciSequenceTest {

    @Test
    public void testAlticciSequenceEqualsZeroEndpoint() {
        given()
          .when().get("/alticci/0")
          .then()
             .statusCode(200)
            .body(is("0"));
    }
    
    @Test
    public void testAlticciSequenceEqualsOneEndpoint() {
        given()
          .when().get("/alticci/1")
          .then()
             .statusCode(200)
            .body(is("1"));
    }

    @Test
    public void testAlticciSequenceEqualsTwoEndpoint() {
        given()
          .when().get("/alticci/2")
          .then()
             .statusCode(200)
            .body(is("1"));
    }
    
    @Test
    public void testAlticciSequenceGreaterThanTwoEndpoint() {
        given()
          .when().get("/alticci/12")
          .then()
             .statusCode(200)
            .body(is("16"));
    }
}
