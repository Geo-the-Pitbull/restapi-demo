package com.research.restapidemo.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    
}
