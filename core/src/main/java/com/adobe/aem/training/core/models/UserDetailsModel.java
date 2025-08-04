package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class UserDetailsModel {

    @ValueMapValue
    private String name;

    @ValueMapValue
    private String des;

    @ValueMapValue
    private String bgImage;

    @ValueMapValue
    private String ctaText;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return des;
    }

    public String getBgImage() {
        return bgImage;
    }

    public String getCtaText() {
        return ctaText;
    }
}
