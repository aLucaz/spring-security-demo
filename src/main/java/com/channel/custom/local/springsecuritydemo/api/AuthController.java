package com.channel.custom.local.springsecuritydemo.api;

import com.channel.custom.local.springsecuritydemo.dto.JwtResponse;
import com.channel.custom.local.springsecuritydemo.service.AuthService;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1.0")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(path = "outh/client/credential/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public JwtResponse login(@RequestBody MultiValueMap<String, String> paramMap, @RequestParam("grant_type") String grantType) {
        return authService.login(paramMap.getFirst("clientId"), paramMap.getFirst("clientSecret"));
    }
}
