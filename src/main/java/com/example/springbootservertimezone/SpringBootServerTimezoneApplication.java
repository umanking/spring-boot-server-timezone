package com.example.springbootservertimezone;

import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootServerTimezoneApplication {

    @PostConstruct
    public void started() {
//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServerTimezoneApplication.class, args);
    }

}
