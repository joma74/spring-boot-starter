package at.joma.playground.starter.vuejs.validators;

import at.joma.playground.starter.vuejs.dto.ValidListDTO;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotEmptyElementsValidator implements ConstraintValidator<NotEmptyElements, ValidListDTO<String>> {

    @Override
    public void initialize(NotEmptyElements constraintAnnotation) {

    }

    @Override
    public boolean isValid(ValidListDTO<String> value, ConstraintValidatorContext context) {
        return !CollectionUtils.isEmpty(value) && !value.stream().anyMatch(StringUtils::isEmpty);
    }
}
