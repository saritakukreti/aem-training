package com.adobe.aem.training.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(
    adaptables = Resource.class,
    resourceType = "aemTraining/components/trainers",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TrainersComponentModel {

    @ChildResource(name = "trainers")
    private List<Trainer> trainers;

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public static class Trainer {
        @ValueMapValue
        String trainerName;

        @ValueMapValue
        String trainerDesignation;

        @ValueMapValue
        String trainerImage;

        public String getTrainerName() {
            return trainerName;
        }

        public String getTrainerDesignation() {
            return trainerDesignation;
        }

        public String getTrainerImage() {
            return trainerImage;
        }
    }
}
