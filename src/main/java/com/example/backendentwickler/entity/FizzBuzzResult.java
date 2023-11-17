package com.example.backendentwickler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import javax.annotation.processing.Generated;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FizzBuzzResult implements Serializable {
    @Id
    private long idFizz;
    private String value;

    public FizzBuzzResult(String value) {
        this.value = value;
    }
}
