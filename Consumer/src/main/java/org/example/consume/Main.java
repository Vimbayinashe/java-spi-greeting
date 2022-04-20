package org.example.consume;

import org.example.greet.Greeting;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class); //classes that implement Greeting interface

        // Alt 2: Lazy Loading
        var greeting = serviceLoader.stream()
                .filter(provider -> provider.type().getSimpleName().startsWith("Swedish"))
                .map(ServiceLoader.Provider::get)
                .findAny();

        greeting.ifPresent(greeting1 -> System.out.println(greeting1.greet()));

        // Alt 2: Eager Loading     (expensive)
//        var greetings = serviceLoader.stream()
//                .map(ServiceLoader.Provider::get)
//                .filter(greeting -> greeting.getClass().getSimpleName().startsWith("Swedish"))  // reflections
//                .toList();

//        for (Greeting greeting : greetings) {
//            if (greeting.getClass().getSimpleName().startsWith("Swedish"))
//                System.out.println(greeting.greet());
//        }

    }

}
