package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class BlogComponentModel {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String desc;

    @ValueMapValue
    private String bgimage;

    @ValueMapValue
    private String ctaText;

    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }
    public String getBgimage() {
        return bgimage;
    }
    public String getCtatext() {
        return ctaText;
    }
}
