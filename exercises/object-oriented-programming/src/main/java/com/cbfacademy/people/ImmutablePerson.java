package com.cbfacademy.people;

import java.util.List;

public class ImmutablePerson {
    private String firstName;
    private String lastName;
    private String middleName;
    private List<String> nickNames;

    public ImmutablePerson(String firstName, String lastName, String middleName, List<String> nickNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickNames = nickNames;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public List<String> getNickNames() {
        return nickNames;
    }
}