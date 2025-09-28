package com.adobe.aem.training.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiProductPojo {

    @JsonProperty("name")
    private String name;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("image")
    private String image;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("category")
    private String category;

    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty("inStock")
    private boolean inStock;

    @JsonProperty("rating")
    private String rating;

    // Getters
    public String getName() { return name; }
    public String getDesc() { return desc; }
    public String getImage() { return image; }
    public Double getPrice() { return price; }
    public String getCategory() { return category; }
    public String[] getTags() { return tags; }
    public boolean isInStock() { return inStock; }
    public String getRating() { return rating; }
}
