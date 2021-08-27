package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.down().build();
//        return Health.up().build();
    }
}
