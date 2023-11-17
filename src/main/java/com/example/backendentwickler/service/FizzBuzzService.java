package com.example.backendentwickler.service;

import com.example.backendentwickler.entity.FizzBuzzResult;
import com.example.backendentwickler.iservice.FizzBuzzIService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService implements FizzBuzzIService {
    @Override
    public List<FizzBuzzResult> generateFizzBuzzList(int number) {
        List<FizzBuzzResult> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            fizzBuzzList.add(new FizzBuzzResult(getFizzBuzzValue(i)));
        }
        return fizzBuzzList;
    }

    private String getFizzBuzzValue(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
