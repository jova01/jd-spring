package com.form.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mentor {

    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private boolean graduated;
    private String batch;
    private String company;

    public String toString(Mentor mentor) throws Exception{
        ObjectMapper mapper =new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(mentor);
    }
}
