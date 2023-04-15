package com.apiSQL;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public Student getStudent() {
        return new Student(
                123456,
                "Awonke Mnotoza",
                21,
                List.of("Cake", "Code"));
    }

    public record Student(
            Integer id,
            String name,
            Integer age,
            List<String> fav) {
    }
}