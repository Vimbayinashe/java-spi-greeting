package org.example.consume;

public class Test {
    private String test = "test";

    // getter added to show that the private field's value changed during reflections
    public String getTest() {
        return test;
    }
}

// a test class -> to test using reflections
// changed access modifier and subsequently value of field test (in Main)
