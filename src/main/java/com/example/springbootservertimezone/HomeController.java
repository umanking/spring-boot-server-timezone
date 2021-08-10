package com.example.springbootservertimezone;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        LocalDateTime now = DateTimeUtils.now();
        return now.toString();
    }
}
