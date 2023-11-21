package com.bilgeadam.JavaSpringUsingProfiles;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevBean {

    @PostConstruct
    public void init() {
        System.out.println("DevBean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DevBean is destroyed");
    }
}
