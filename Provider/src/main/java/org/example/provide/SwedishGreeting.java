package org.example.provide;

import org.example.greet.Address;
import org.example.greet.Greeting;

@Address("swedish")
public class SwedishGreeting implements Greeting {

    public SwedishGreeting() {
        System.out.println("Swedish created");
    }

    @Override
    public String greet() {
        return "Hej!";
    }



}
