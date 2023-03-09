package com.saber.springquerydsldemo.model.command;

import lombok.Data;


@Data
public class PersonCommand {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String nationalCode;
    private String mobile;
}
