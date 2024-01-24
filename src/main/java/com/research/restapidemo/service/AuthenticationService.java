package com.research.restapidemo.service;

import com.research.restapidemo.dto.JwtAuthenticationResponse;
import com.research.restapidemo.dto.RefreshTokenRequest;
import com.research.restapidemo.dto.SignInRequest;
import com.research.restapidemo.dto.SignUpRequest;
import com.research.restapidemo.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    public JwtAuthenticationResponse signin(SignInRequest signinRequest);
    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
