package com.adobe.aem.training.core.models;


import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SecondComponentModel {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String eyebrow;

    @ValueMapValue
    private String header;

    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
    public String getEyebrow() {
        return eyebrow;
    }
    public String getHeader() {
        return header;
    }
}
