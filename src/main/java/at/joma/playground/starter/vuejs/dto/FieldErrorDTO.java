package at.joma.playground.starter.vuejs.dto;

public class FieldErrorDTO {

    private String field;

    private String error;

    public String getError() {
        return error;
    }

    public FieldErrorDTO(String field, String error) {
        this.field = field;
        this.error = error;
    }

    public String getField() {
        return field;
    }

}
