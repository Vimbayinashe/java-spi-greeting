package org.example.provide;

import org.example.greet.Greeting;

public class EnglishGreeting implements Greeting {

    public EnglishGreeting() {
        System.out.println("English created");
    }

    @Override
    public String greet() {
        return "Hello!";
    }

}
