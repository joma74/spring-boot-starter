package at.joma.playground.starter.vuejs;

import at.joma.playground.starter.vuejs.dto.SkillsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@Controller
@CrossOrigin
@SessionAttributes(SkillsController.SKILLS)
public class SkillsController {

    public static final String SKILLS = "skills";

    @ModelAttribute(SKILLS)
    public SkillsDTO skills() {
        return new SkillsDTO();
    }

    @RequestMapping(value = "/api/" + SKILLS, method = RequestMethod.GET)
    @ResponseBody
    public SkillsDTO getSkills(@ApiIgnore ModelMap model) {
        RequestContextHolder.currentRequestAttributes().getSessionId();
        SkillsDTO skills = (SkillsDTO) model.get(SKILLS);
        return skills;
    }

    @RequestMapping(value = "/api/" + SKILLS, method = RequestMethod.PUT)
    @ResponseBody
    public void putSkills(@Valid @RequestBody SkillsDTO param, @ApiIgnore ModelMap model) {
        RequestContextHolder.currentRequestAttributes().getSessionId();
        SkillsDTO skills = (SkillsDTO) model.get(SKILLS);
        skills.addSkills(param);
    }

    @RequestMapping(value = "/api/" + SKILLS, method = RequestMethod.POST)
    @ResponseBody
    public void postSkills(@Valid @RequestBody SkillsDTO param, @ApiIgnore ModelMap model) {
        RequestContextHolder.currentRequestAttributes().getSessionId();
        SkillsDTO skills = (SkillsDTO) model.get(SKILLS);
        skills.replaceSkills(param);
    }
}
