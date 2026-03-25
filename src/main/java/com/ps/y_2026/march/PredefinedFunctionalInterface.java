package com.ps.y_2026.march;

import java.util.function.*;

public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        System.out.println("============== Predicate =============");
        Predicate<Integer> predicate= i->i>10;
        System.out.println(predicate.test(12));
        System.out.println(predicate.test(9));
        Predicate<String> predicate1 = s->s.length()>5;
        System.out.println(predicate1.test("Fakir"));
        System.out.println(predicate1.test("FakirMohan"));

        System.out.println("========== BiPredicate =========");
        BiPredicate<Integer,Integer> biPredicateObj = (i,j)->i>j;
        System.out.println(biPredicateObj.test(2,5));
        System.out.println(biPredicateObj.test(3,2));
        BiPredicate<String,Integer> biPredicateObj2 = (s,i)->s.length()>i;
        System.out.println(biPredicateObj2.test("fakir",4));
        System.out.println(biPredicateObj2.test("fakir",7));

        System.out.println("========= Function =========");
        Function<Integer,Integer> function = i->i*i;
        int num=3;
        System.out.println("Square of "+num+" is "+function.apply(num));
        Function<String,Integer> function1 = s->s.length();
        String input="Fakir";
        System.out.println("Length of "+input+" is "+function1.apply(input));

        System.out.println("======== BiFunction =========");
        BiFunction<String,String,Boolean> function2 = (s1,s2)->s1.equalsIgnoreCase(s2);
        System.out.println(function2.apply("Fakir","Mohan"));
        System.out.println(function2.apply("Fakir","Fakir"));

        System.out.println("======== Consumer ========");
        Consumer<String> consumer = s->System.out.println("Entered String is "+s);
        consumer.accept("Fakir");

        System.out.println("======= BiConsumer ========");
        BiConsumer<String, String> biConsumer = (s1,s2)->System.out.println("Hello Mr. "+s1+" "+s2);
        biConsumer.accept("Fakir","Mohan");

        System.out.println("========= Supplier =========");
        Supplier<String> supplier = ()->"Fakir";
        System.out.println("Welcome Back !!!"+supplier.get());
    }
}
