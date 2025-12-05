package com.example.demo.routes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomePageRoute{
    @RequestMapping
    public Map<String, Object> homePage() {
        return Map.of(
            "message", "Welcome to the User Management API",
            "version", "1.0.0"
        );
    }
}