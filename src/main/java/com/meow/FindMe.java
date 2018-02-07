package com.meow;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("findMe")
public class FindMe implements Function<String, String> {
    @Override
    public String apply(final String uppercaseRequest) {
        return uppercaseRequest.toUpperCase();
    }
}