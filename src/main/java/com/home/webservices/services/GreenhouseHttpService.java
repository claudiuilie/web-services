package com.home.webservices.services;

import com.home.webservices.configurations.GreenhouseConfiguration;
import com.home.webservices.models.Greenhouse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;

@Service
public class GreenhouseHttpService {

    private final GreenhouseConfiguration greenhouseConfiguration;

    public GreenhouseHttpService(GreenhouseConfiguration greenhouseConfiguration) {
        this.greenhouseConfiguration = greenhouseConfiguration;
    }

    private RequestSpecBuilder fillDefaults(){
        final RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        return reqBuilder.setBaseUri(greenhouseConfiguration.getHost()).setContentType("application/json");
    }

    public Greenhouse getGreenhouseStatus() {

        Response response = given(fillDefaults().build()).log().all().get();
        response.getBody().print();
        return  response.as(Greenhouse.class);
    }
}
