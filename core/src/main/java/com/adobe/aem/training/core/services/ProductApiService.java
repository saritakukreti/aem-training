package com.adobe.aem.training.core.services;

import com.adobe.aem.training.core.models.ApiProductPojo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.fluent.Request;
import org.osgi.service.component.annotations.Component;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

@Component(service = ProductApiService.class, immediate = true)
public class ProductApiService {

    private static final String API_URL = "https://mocki.io/v1/b98516c3-5d70-43be-b368-38121cdebc49";

    public List<ApiProductPojo> fetchProducts() {
        try {
            String response = Request.Get(API_URL)
                    .connectTimeout(5000)
                    .socketTimeout(5000)
                    .execute()
                    .returnContent()
                    .asString(StandardCharsets.UTF_8);

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response, new TypeReference<List<ApiProductPojo>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
