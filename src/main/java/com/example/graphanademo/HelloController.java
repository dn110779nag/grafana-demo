package com.example.graphanademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/say-hello")
    Object sayHello(){
        return Map.of("time", LocalDateTime.now());
    }
}
