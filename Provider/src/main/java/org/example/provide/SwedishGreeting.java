package org.example.provide;

import org.example.greet.Address;
import org.example.greet.Greeting;
import org.jetbrains.annotations.NotNull;

@Address("swedish")
public class SwedishGreeting implements Greeting {

    public SwedishGreeting() {
        System.out.println("Swedish created");
    }

    @Override
    @Address("annotation on a method")
    public String greet() {
        return "Hej!";
    }

//    @NotNull                        // method cannot return null -> throws compilation error
//    public  String testMethod() {
//        return null;
//    }

}
