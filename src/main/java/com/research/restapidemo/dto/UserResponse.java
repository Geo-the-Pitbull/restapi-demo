package com.research.restapidemo.dto;

public class UserResponse {
     
    private String FirstName;
    private String LastName;
    private String Email;
    private String Role;

    // Empty Constructor Class
    public UserResponse() {
    }

    public UserResponse(String FirstName, String LastName, String Email, String Role) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Role = Role;
    }

    // Getters
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getEmail() {
        return Email;
    }
    public String getRole() {
        return Role;
    }

    // Setters
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setRole(String Role) {
        this.Role = Role;
    }
    
}




