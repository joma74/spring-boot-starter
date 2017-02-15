package at.joma.playground.starter.vuejs.dto;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class ProjectsDTO {

    @Valid
    private List<ProjectDTO> projects = new ArrayList<>();

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void addProject(ProjectDTO param) {
        this.projects.add(param);
    }
}
