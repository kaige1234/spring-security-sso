package com.sunkai.spring.sercurity.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class SpringSercurityAApplication {

    @GetMapping("/user")
    public Authentication user(Authentication user){
        return user;

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSercurityAApplication.class, args);
    }

}
