package com.ps.java8;

import java.time.LocalDateTime;
import java.util.function.*;

//PFCS - Predicate, Function, Consumer, Supplier
public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        //Predicate --> abstract method is test --> takes 1 input and return boolean
        Predicate<Integer> predicate=(i)->i%2==0;
        System.out.println("Given Number is Even :: "+predicate.test(14));

        //BiPredicate -- takes 2 input and return boolean
        BiPredicate<String,String> biPredicate=(s1,s2)->s1.equals(s2);
        System.out.println("Given Strings \"%s\" and \"%s\" are equal :: ".formatted("Fakir","Mohan")+biPredicate.test("Fakir","Mohan"));
        System.out.println("Given Strings are equal :: "+biPredicate.test("Mohan","Mohan"));

        //Function --> abstract method is apply --> Takes 1 input and return any type
        Function<String,Integer> function=(s)->s.length();
        System.out.println("Length of the Given String is :: "+function.apply("Fakir Mohan"));


        //BiFunction --> Takes 2 input and return any type
        BiFunction<String,String,String> biFunction=(s1,s2)->"Hello "+s1+" "+s2;
        String result=biFunction.apply("Fakir","Mohan");
        System.out.println(result);

        //Consumer --> abstract method is  accept --> Takes 1 input and return nothing
        Consumer<String> consumer=(s)->System.out.println(s);
        consumer.accept("Java");

        //BiConsumer --> Takes 2 inputs and return nothing
        BiConsumer<String,String> biConsumer=(s1,s2)->System.out.println("Do Logic using %s and %s but return nothing".formatted(s1,s2));
        biConsumer.accept("Str1","Str2");

        //Supplier --> abstract method is --> Takes no input but return output
        Supplier<String> supplier=()->"Just Chill";
        Supplier<LocalDateTime> supplier1=()-> LocalDateTime.now();
        System.out.println(supplier.get());
        System.out.println(supplier1.get());

    }
}
