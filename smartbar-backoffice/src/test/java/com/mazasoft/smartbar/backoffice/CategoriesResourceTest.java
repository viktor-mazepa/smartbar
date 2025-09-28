package com.mazasoft.smartbar.backoffice;

import com.mazasoft.smartbar.backoffice.api.model.Category;
import com.mazasoft.smartbar.backoffice.services.CategoriesService;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;

@QuarkusTest
class CategoriesResourceTest {

    @InjectMock
    CategoriesService categoriesServiceMock;

    @BeforeEach
    void setUp() {
        Mockito.when(categoriesServiceMock.get()).thenReturn(new Category().name("Mock"));
    }

    @Test
    void getsListOfCategories() {
        final Response response = given()
                .when().get("/categories")
                .then()
                .statusCode(200)
                .extract().response();
        final JsonPath jsonPath = response.jsonPath();

        Assertions.assertEquals("Mock", jsonPath.getString("[0].name"));
    }

}