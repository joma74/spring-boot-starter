package at.joma.playground.starter.vuejs.dto;

import at.joma.playground.starter.vuejs.validators.NotEmptyElements;

public class SkillsDTO {

    @NotEmptyElements
    private ValidListDTO<String> skills = new ValidListDTO<>();

    public ValidListDTO<String> getSkills() {
        return skills;
    }

    public void setSkills(ValidListDTO<String> skills) {
        this.skills = skills;
    }

    public void add(SkillsDTO param) {
        this.skills.addAll(param.getSkills());
    }
}
