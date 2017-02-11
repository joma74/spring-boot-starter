package at.joma.playground.starter.vuejs.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyElementsValidator.class)
@Documented
public @interface NotEmptyElements {

    String message() default "List cannot contain empty elements";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
