package at.joma.playground.starter.vuejs.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

public class ProjectDTO {

    @Valid
    @NotEmpty
    private String name;

    @Valid
    @NotEmpty
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
