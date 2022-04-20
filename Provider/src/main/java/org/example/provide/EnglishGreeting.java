package org.example.provide;

import org.example.greet.Greeting;

public class EnglishGreeting implements Greeting {

    @Override
    public String greet() {
        return "Hello!";
    }

}
