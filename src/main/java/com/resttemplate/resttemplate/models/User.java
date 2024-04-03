package com.resttemplate.resttemplate.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String lastName;
    private Byte age;

    public User(){}


    @Override
    public String toString() {
        return String.format("{id=%d, name=%s, lastName=%s, age=%d}", id, name, lastName, age);
    }

}
