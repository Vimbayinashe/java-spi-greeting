package org.example.greet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Address {
    String value() default "empty";
}

/* String value();
 * without a default anyone using this annotation MUST provide a value
 */
