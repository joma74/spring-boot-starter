package at.joma.playground.starter.vuejs;

import at.joma.playground.starter.vuejs.dto.ProjectDTO;
import at.joma.playground.starter.vuejs.dto.ProjectsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@Controller
@CrossOrigin
@SessionAttributes(ProjectsController.PROJECTS)
public class ProjectsController {

    public static final String PROJECTS = "projects";

    @ModelAttribute(PROJECTS)
    public ProjectsDTO projects() {
        ProjectsDTO newProjects = new ProjectsDTO();
        return newProjects;
    }

    @RequestMapping(value = "/api/" + PROJECTS, method = RequestMethod.GET)
    @ResponseBody
    public ProjectsDTO getProjects(@ApiIgnore ModelMap model) {
        RequestContextHolder.currentRequestAttributes().getSessionId();
        ProjectsDTO projects = (ProjectsDTO) model.get(PROJECTS);
        return projects;
    }

    @RequestMapping(value = "/api/" + PROJECTS, method = RequestMethod.PUT)
    @ResponseBody
    public void putProject(@Valid @RequestBody ProjectDTO param, @ApiIgnore ModelMap model) {
        RequestContextHolder.currentRequestAttributes().getSessionId();
        ProjectsDTO projects = (ProjectsDTO) model.get(PROJECTS);
        projects.addProject(param);
    }
}
