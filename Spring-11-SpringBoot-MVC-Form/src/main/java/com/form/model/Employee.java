package com.form.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {

    private String firstname;
    private String lastname;
    private String birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String state;
    private String zipCode;
    private String city;

}
