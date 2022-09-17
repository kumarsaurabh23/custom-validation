package com.example.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidation implements ConstraintValidator<ValidateEmployeeType, String> {

    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext context) {
        List<String> employeeTypes = Arrays.asList("Permanent", "Contractor");
        return employeeTypes.contains(employeeType);
    }
}
