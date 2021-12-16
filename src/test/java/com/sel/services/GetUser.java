package com.sel.services;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.Header;

import java.util.ArrayList;
import java.util.List;

public class GetUser {
    public static void main(String[] args) {


        String strResponse = "";
        String token = "";
        io.restassured.response.Response response = null;

        String baseURL = "https://reqres.in/api/users/2";
        try {
            RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().
                    relaxedHTTPSValidation());
            response = RestAssured
                    .given()
                    .relaxedHTTPSValidation("SSL")
                    .baseUri(baseURL)
                    .get();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
