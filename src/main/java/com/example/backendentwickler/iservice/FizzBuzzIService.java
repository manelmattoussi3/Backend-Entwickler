package com.example.backendentwickler.iservice;

import com.example.backendentwickler.entity.FizzBuzzResult;

import java.util.List;

public interface FizzBuzzIService {
    List<FizzBuzzResult> generateFizzBuzzList(int number);
}
