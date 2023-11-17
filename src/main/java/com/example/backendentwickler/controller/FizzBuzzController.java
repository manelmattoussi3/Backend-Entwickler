package com.example.backendentwickler.controller;

import com.example.backendentwickler.entity.FizzBuzzResult;
import com.example.backendentwickler.iservice.FizzBuzzIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fizzbuzz")
public class FizzBuzzController {
    @Autowired
    FizzBuzzIService fizzBuzzIService;
    @GetMapping("/{number}")
    public List<FizzBuzzResult> getFizzBuzzList(@PathVariable int number) {
        return fizzBuzzIService.generateFizzBuzzList(number);
    }
}
