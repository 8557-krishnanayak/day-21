package com.example.SpringBootAssigment.Controller;

import com.example.SpringBootAssigment.DTO.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/filter")
    public ResponseEntity<List<User>> doFilter(@RequestParam(name = "age", defaultValue = "0", required = false) String age_par, @RequestParam(name = "city", defaultValue = "", required = false) String city) {

        int age = Integer.parseInt(age_par);
        List<User> list = List.of(
                new User("1", "krishna", 21, "JSR"),
                new User("2", "Azam", 22, "HYD"),
                new User("3", "Revanth", 25, "HYD")
        );

        List<User> collect = list.stream()
                .filter(user -> user.getAge() >= age)
                .filter(user -> user.getCity().equals(city) || city.isEmpty())
                .collect(Collectors.toList());

        return ResponseEntity.ok(collect);
    }
}
