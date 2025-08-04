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
public class TrainerModel {

    @ValueMapValue
    private String trainerName;

    @ValueMapValue
    private String trainerDesignation;

    @ValueMapValue
    private String trainerImage;

    @ChildResource
    private List<SpecializationModel> specialization;

    public String getTrainerName() {
        return trainerName;
    }

    public String getTrainerDesignation() {
        return trainerDesignation;
    }

    public String getTrainerImage() {
        return trainerImage;
    }

    public List<SpecializationModel> getSpecialization() {
        return specialization;
    }
    
}