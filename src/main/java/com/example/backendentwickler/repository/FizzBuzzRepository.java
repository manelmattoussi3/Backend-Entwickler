package com.example.backendentwickler.repository;

import com.example.backendentwickler.entity.FizzBuzzResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FizzBuzzRepository extends JpaRepository<FizzBuzzResult,Long> {
}
