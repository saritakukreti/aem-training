package com.adobe.aem.training.core.models;

import com.adobe.aem.training.core.services.ProductApiService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Model(
        adaptables = Resource.class,
        resourceType = "aemTraining/components/product-list",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class ProductListModel {

    @OSGiService
    private ProductApiService apiService;

    private List<ApiProductPojo> products;

    @PostConstruct
    protected void init() {
        products = apiService.fetchProducts();
        System.out.println("Fetched products: " + products); // debug log
    }

    @JsonProperty("products")
    public List<ApiProductPojo> getProducts() {
        return products != null ? products : Collections.emptyList();
    }
}
