package at.joma.playground.starter.vuejs.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class CommentDTO {

    @NotEmpty
    @Length(max = 140)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
