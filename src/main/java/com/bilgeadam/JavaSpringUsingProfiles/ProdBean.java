package com.bilgeadam.JavaSpringUsingProfiles;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean {

    @PostConstruct
    public void init() {
        System.out.println("ProdBean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ProdBean is destroyed");
    }
}
