package org.example.consume;

import org.example.greet.Address;
import org.example.greet.Greeting;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class); //classes that implement Greeting interface

        // Alt 3: Reflections
        for (Greeting greeting : serviceLoader) {
            var annotation = greeting.getClass().getAnnotation(Address.class);

            if(annotation == null)
                System.out.println("No annotation of type Address found");
            else
                System.out.println("Annotation Address on class - " + annotation.value());

            var methodAnnotation = greeting.getClass().getMethod("greet").getAnnotation(Address.class);

            if(methodAnnotation != null)
                System.out.println("Annotated method: " + methodAnnotation.value());

            System.out.println("------------------------------");
        }

        // Alt 2: Lazy Loading
//        var greeting = serviceLoader.stream()
//                .filter(provider -> provider.type().getSimpleName().startsWith("Swedish"))
//                .map(ServiceLoader.Provider::get)
//                .findAny();
//        greeting.ifPresent(greeting1 -> System.out.println(greeting1.greet()));

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
