package pl.altkom.springcloud.lab02.feign.employeeservice.controller.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class CreateEmployeeRequest {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String city;
    private Long projectId;
}
