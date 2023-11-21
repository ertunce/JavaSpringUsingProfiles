package com.bilgeadam.JavaSpringUsingProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ProfileTestController {

    @Autowired
    private ApplicationContext context;

    @Value("${app.database.url}")
    private String dbURL;

    @GetMapping("/profile-test")
    public ResponseEntity<String> testProfile() {
        String activeProfile = Arrays.toString(context.getEnvironment().getActiveProfiles());
        return ResponseEntity.ok("Active Profile: " + activeProfile);
    }

    @GetMapping("/db-url")
    public ResponseEntity<String> testDB_URL() {
        return ResponseEntity.ok("DB URL: " + dbURL);
    }

}

