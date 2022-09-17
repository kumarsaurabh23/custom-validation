package com.example.customvalidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidation.class)
public @interface ValidateEmployeeType {
    public String message();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
