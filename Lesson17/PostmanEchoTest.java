package Lesson17;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostmanEchoTest {
    private final static String BaseURI = "https://postman-echo.com";
    private final static String TestText = "Hello World";

    @BeforeEach
    public void init() {
        RestAssured.baseURI = BaseURI;
    }

    @Test
    @DisplayName("GET Request")
    public void getRequest() {
        given()
                .log().body()
                .when().get("/get?foo1=bar1&foo2=bar2")
                .then()
                .log().body()
                .assertThat().statusCode(200)
                .and().body("args.foo1", is("bar1"))
                .and().body("args.foo2", is("bar2"));
    }

    @Test
    @DisplayName("POST Raw Text")
    public void postRawText() {

        given()
                .body(TestText)
                .log().body()
                .when().post("/post")
                .then()
                .log().body()
                .assertThat().statusCode(200)
                .and().body("data", is(TestText));
    }

    @Test
    @DisplayName("POST Form Data")
    public void postFormData() {
        given()
                .log().body()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .when().post("/post")
                .then()
                .log().body()
                .assertThat().statusCode(200)
                .and().body("form.foo1", is("bar1"))
                .and().body("form.foo2", is("bar2"));
    }

    @Test
    @DisplayName("PUT Request")
    public void putRequest() {
        given()
                // .log().all()
                .body(TestText)
                .when().put("/put")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(TestText));
    }

    @Test
    @DisplayName("PATCH Request")
    public void patchRequest() {
        given()
                // .log().all()
                .body(TestText)
                .when().patch("/patch")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(TestText));
    }

    @Test
    @DisplayName("DELETE Request")
    public void deleteRequest() {
        given()
                // .log().all()
                .body(TestText)
                .when().delete("/delete")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(TestText));
    }
}