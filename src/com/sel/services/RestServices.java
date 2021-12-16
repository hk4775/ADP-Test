package com.sel.services;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.Header;
import io.restassured.http.Headers;

import static io.restassured.RestAssured.given;

public class RestServices {
    public static void main(String[] args) {


            String strResponse = "";
            String token = "";
            io.restassured.response.Response response = null;

            String baseURL = "https://reqres.in/api/users?page=2";
            String strEndPoint = "/api/users?page=1";
            try {

                List<Header> headerlist = new ArrayList<Header>();
                headerlist.add(new Header("Content-Type", "application/x-www-form-urlencoded"));
//            headerlist.add(new Header("Authorization",
//                    "Basic V2NUQlI1bzZTNVB2eGJHUWY4NjhscGJmblhjMllxS3o6MXRGQlFVSll5aENHR0JIWQ=="));
                Map<String, String> reqObject = new HashMap<>();

                // headerlist.add(new Header("User-Agent", "Mozilla/5.0 (Windows NT
                // 10.0; Win64; x64)"));
                //RestAssured.proxy
                try {
                    RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
                    response = RestAssured
                            .given()
                            .relaxedHTTPSValidation("SSL")
                            .baseUri(baseURL)
                            .get();
                } catch (Exception e) {
                    e.getStackTrace();
                }

                InputStream strm = response.getBody().asInputStream();
                Reader reader = new InputStreamReader(strm);
                strResponse = CharStreams.toString(reader);
                saveUserResponse(strResponse);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return token;
        }

    private void saveUserResponse(String strResponse) {

        Type listType = new TypeToken<Response>(){}.getType();
        Response data = new Gson().fromJson(strResponse, listType);
        System.out.println(data);
    }
}
