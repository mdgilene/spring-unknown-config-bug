package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "test")
public class TestProperties {
    private String property;
}
