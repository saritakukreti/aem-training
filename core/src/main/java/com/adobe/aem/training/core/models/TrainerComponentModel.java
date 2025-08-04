package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TrainerComponentModel {

    @ValueMapValue
    private String heading;

    @ChildResource
    List<TrainerModel> trainers;

    public String getHeading() {
        return heading;
    }

    public List<TrainerModel> getTrainers() {
        return trainers;
    }
    
}
