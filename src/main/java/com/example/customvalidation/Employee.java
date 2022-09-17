package com.example.customvalidation;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class Employee {
    private int id;
    @NotBlank(message = "firstName cannot be blank or empty")
    private String firstName;
    @NotBlank(message = "lastName cannot be blank or empty")
    private String lastName;
    @ValidateEmployeeType(message = "employeeType is not valid")
    private String employeeType;
}
