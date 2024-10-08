package com.ps.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakerClass {
    public static void main(String[] args) {
        try {
            // Access the constructor of SingletonClass
            Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();

            // Make the constructor accessible
            constructor.setAccessible(true);

            // Attempt to create a new instance of SingletonClass using reflection
            SingletonClass s1 = constructor.newInstance(); // This will succeed
            SingletonClass s2 = constructor.newInstance(); // This will throw an exception

            // Check if the two instances are the same (this line won't be executed)
            System.out.println(s1 == s2);
        } catch (IllegalStateException e) {
            System.out.println("Reflection attempt failed: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
