package com.example.SpringBootAssigment.Controller;

import com.example.SpringBootAssigment.Service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private OperationService operationService; //field injection

    @Autowired
    public CalculatorController(OperationService operationService) {
        this.operationService = operationService;
    }

    //    Setter Injection

    public void setOperationService(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping
    public String operationMethod(@RequestParam("operation") String operation, @RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        Integer i = Integer.parseInt(num1);
        Integer j = Integer.parseInt(num2);

            Number out = switch (operation) {
                case "add" -> operationService.add(i, j);
                case "sub" -> operationService.sub(i, j);
                case "multiply" -> operationService.multi(i, j);
                case "divide" -> operationService.divide(i, j);
                default -> throw new RuntimeException("Unexpected value: " + operation);
            };
            return operation + "\t" + out;


    }
}
