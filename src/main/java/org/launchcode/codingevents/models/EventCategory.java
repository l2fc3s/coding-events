package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class EventCategory extends AbstractEntity{


    @NotBlank(message="Name cannot be blank")
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory(){

    }


    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
