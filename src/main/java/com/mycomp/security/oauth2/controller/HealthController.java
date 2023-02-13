package com.mycomp.security.oauth2.controller;

import com.mycomp.security.oauth2.model.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public Health health() {
        return new Health("UP");
    }
}
