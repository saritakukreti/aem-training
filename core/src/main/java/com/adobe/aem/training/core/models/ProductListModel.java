package com.adobe.aem.training.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.Collections;
import java.util.List;

@Model(
    adaptables = Resource.class,
    resourceType = "aemTraining/components/product-list",  
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
    name = "jackson",
    extensions = "json"
)
public class ProductListModel {

    // Child resources from multifield, automatically adapted to ProductModel
    @ChildResource(name = "productItem")
    private List<ProductModel> productList;

    @JsonProperty("products")
    public List<ProductModel> getProducts() {
        return productList != null ? productList : Collections.emptyList();
    }
}
