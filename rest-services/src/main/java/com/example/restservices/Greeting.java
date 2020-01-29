package com.example.restservices;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Greeting
 */
@Getter
@AllArgsConstructor
public class Greeting {

    private final long id;
    private final String content;
    
}