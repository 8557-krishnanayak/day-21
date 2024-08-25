package com.example.SpringBootAssigment.Controller;

import com.example.SpringBootAssigment.DTO.User;
import com.example.SpringBootAssigment.Service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/field")
public class FieldController {


    private OperationService operationService;

    @Autowired
    public FieldController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping
    public ResponseEntity<User> responseMethod(@RequestBody User user) {
        System.out.println("user\t" + user.toString());
        return ResponseEntity.ok(user);
    }
}
