package com.ps.java8.stream;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MSExcerciseMainClass {
    public static void main(String[] args) {
        Product p1= new Product(1L,"baby","Toys",100.0);
        Product p2= new Product(2L,"James Bond","Books",100.0);
        Product p3= new Product(3L,"car1","Baby",106.0);
        Product p4= new Product(4L,"carBook","Books",300.0);

        Customer c1 = new Customer(1L,"Sarika","A");
        Customer c2 = new Customer(2L,"Sarika1","B");

        Order o1= new Order(1L,"Confirm",LocalDate.of(2021,03,15), LocalDate.now(),Product.getAllProducts(),c1);
        Order o2= new Order(2L,"Pending",LocalDate.of(2021,02,01), LocalDate.now(),Product.getAllProducts(),c1);
        Order o3= new Order(3L,"Pending",LocalDate.of(2021,02,04), LocalDate.now(), Arrays.asList(p1,p2),c1);


        Optional<Product> result4= Arrays.asList(p1,p2,p3,p4).stream()
                .filter(p->p.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(p->p.getPrice()));

        System.out.println(result4);

        //3 most recent orders

        List<Order> result5= Arrays.asList(o1,o2,o3).stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toUnmodifiableList());

        System.out.println("result5 "+result5);

        //order on 15-Mar-2012 also log the recoeds to console

        Arrays.asList(o1,o2,o3).stream()
                .filter(o->o.getOrderDate().equals(LocalDate.of(2021,03,15)));


        //Total lump sum of all order placec in Feb 2021

        Arrays.asList(o1,o2,o3).stream()
                .filter(o->o.getOrderDate().isAfter(LocalDate.of(2021,02,01)))
                .filter(o->o.getOrderDate().isBefore(LocalDate.of(2021,03,01)))
                .flatMap(o->o.getProducts().stream())
                .mapToDouble(p->p.getPrice())
                .sum();


        //Average Payment Placed on 15-Mar-2021

        Arrays.asList(o1,o2,o3)
                .stream()
                .filter(o->o.getOrderDate().isEqual(LocalDate.of(2021,03,21)))
                .flatMap(o->o.getProducts().stream())
                .mapToDouble(p->p.getPrice())
                .average()
                //.getAsDouble()
                ;

        //Obtain a collection of statistics figure

        DoubleSummaryStatistics result10=Arrays.asList(p1,p2,p3,p4)
                .stream()
                .filter(p->p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(p->p.getPrice())
                .summaryStatistics();

        System.out.println("Count"+result10.getCount());

        //Order Product Count
        Map<Long,Integer> result11=Arrays.asList(o1,o2,o3)
                .stream()
                .collect(Collectors.toMap(o->o.getId(),o->o.getProducts().size()));
        System.out.println("result11 "+result11);

        //Produce a datamap

        Map<Customer,List<Order>> result12 = Arrays.asList(o1,o2,o3)
                .stream()
                .collect(Collectors.groupingBy(o->o.getCustomer()));

        System.out.println("result12 "+result12);

        Map<Order,Double> result13= Arrays.asList(o1,o2,o3)
                .stream()
                .collect(Collectors.toMap(Function.identity(),
                        o->o.getProducts().stream().mapToDouble(p->p.getPrice()).sum()));

        System.out.println("result13 "+result13);

        //datamap with list of product name by category

        Map<String,List<String>> result14=Arrays.asList(p1,p2,p3,p4).stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.mapping(p->p.getName(),
                                Collectors.toList())));
        System.out.println("result14 "+result14);

        //Get the most expensive product by category

        Map<String,Optional<Product>> result15=Arrays.asList(p1,p2,p3,p4).stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.maxBy(Comparator.comparing(Product::getPrice))));
        System.out.println("result15 "+result15);

    }
}
