package com.bridgelabz.rest_api_calls.model;

/**
 * this class is used create the model to pass the attribute in the post method
 * as fistName and lastName.
 */
public class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
