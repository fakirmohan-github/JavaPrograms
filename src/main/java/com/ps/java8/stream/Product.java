package com.ps.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Product {
    Long id;
    String name;
    String category;
    Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Product> getAllProducts(){
        Product p1= new Product(1L,"baby","Toys",100.0);
        Product p2= new Product(2L,"James Bond","Books",100.0);
        Product p3= new Product(3L,"car1","Baby",106.0);
        Product p4= new Product(4L,"carBook","Books",300.0);
        List<Product> productList= Arrays.asList(p1,p2,p3,p4);
        return productList;
    }

}
