package com.example.microservicefront;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        System.out.println("First Debug :))");
        return ResponseEntity.ok("I am alive");
    }
}
