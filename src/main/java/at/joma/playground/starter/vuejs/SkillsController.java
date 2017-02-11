package at.joma.playground.starter.vuejs;

import at.joma.playground.starter.vuejs.dto.SkillsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class SkillsController {

    private static SkillsDTO skills = new SkillsDTO();

    @RequestMapping(value = "/api/skills", method = RequestMethod.GET)
    @ResponseBody
    public SkillsDTO getAll() {
        return skills;
    }

    @RequestMapping(value = "/api/skills", method = RequestMethod.PUT)
    @ResponseBody
    public void put(@Valid @RequestBody SkillsDTO param) {
        skills.add(param);
    }
}
