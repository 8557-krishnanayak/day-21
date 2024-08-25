package com.example.SpringBootAssigment.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    public static final Logger logger = LoggerFactory.getLogger(OperationService.class);

    public Integer add(Integer i, Integer j) {
        logger.info("ADD operation started");
        return i + j;
    }

    public Integer sub(Integer i, Integer j) {
        logger.info("Subtraction operation started");
        return i - j;
    }

    public Integer multi(Integer i, Integer j) {
        logger.info("Multiplication operation started");
        return i * j;
    }

    public Double divide(Integer i, Integer j) {
        logger.info("Division operation started");
        return (double) i / j;
    }
}
