package org.example.consume;

import org.example.greet.Greeting;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class); //classes that implement Greeting interface

        for (Greeting greeting : serviceLoader) {

            System.out.println(greeting.getClass().getSimpleName());

            System.out.println(greeting.greet());
        }

        System.out.println("-------------------------------");

        serviceLoader.stream()
                .map(ServiceLoader.Provider::get)
                .filter(greeting -> greeting.getClass().getSimpleName().startsWith("Swedish"))  // reflections
                .forEach(greetingProvider -> System.out.println(greetingProvider.greet()));

    }

}
