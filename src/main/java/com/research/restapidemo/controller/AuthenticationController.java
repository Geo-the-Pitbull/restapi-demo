package com.research.restapidemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.restapidemo.dto.JwtAuthenticationResponse;
import com.research.restapidemo.dto.RefreshTokenRequest;
import com.research.restapidemo.dto.SignInRequest;
import com.research.restapidemo.dto.SignUpRequest;
import com.research.restapidemo.dto.UserResponse;
import com.research.restapidemo.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*/*", maxAge = 3600)
public class AuthenticationController {
    
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<UserResponse> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest signinRequest) {
        return ResponseEntity.ok(authenticationService.signin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest) {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}
