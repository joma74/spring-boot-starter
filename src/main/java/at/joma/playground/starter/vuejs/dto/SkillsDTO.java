package at.joma.playground.starter.vuejs.dto;

import at.joma.playground.starter.vuejs.validators.NotEmptyElements;

public class SkillsDTO {

    @NotEmptyElements
    private ValidListDTO<String> skills = new ValidListDTO<>();

    public ValidListDTO<String> getSkills() {
        return skills;
    }

    public void replaceSkills(SkillsDTO param) {
        this.skills.clear();
        this.skills.addAll(param.getSkills());
    }

    public void addSkills(SkillsDTO param) {
        this.skills.addAll(param.getSkills());
    }
}
