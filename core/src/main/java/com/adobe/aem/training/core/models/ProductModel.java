package com.adobe.aem.training.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ProductModel {

    @ValueMapValue
    private String productName;

    @ValueMapValue
    private String productDesc;

    @ValueMapValue
    private String productImage;

    @ValueMapValue
    private Double productPrice;

    @ValueMapValue
    private String productCategory;

    @ValueMapValue
    private String[] productTags;

    @ValueMapValue
    private boolean inStock;

    // JSON Exporter properties
    @JsonProperty("name")
    public String getProductName() { return productName; }

    @JsonProperty("desc")
    public String getProductDesc() { return productDesc; }

    @JsonProperty("image")
    public String getProductImage() { return productImage; }

    @JsonProperty("price")
    public Double getProductPrice() { return productPrice; }

    @JsonProperty("category")
    public String getProductCategory() { return productCategory; }

    @JsonProperty("tags")
    public String[] getProductTags() { return productTags; }

    @JsonProperty("inStock")
    public boolean isInStock() { return inStock; }
}