package com.ps.java8.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    Long id;
    String status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;

    public Order() {
    }

    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }

   /* public static List<Order> getOrderList(){
        List<Order> orderList = new ArrayList<>();
        List<Product> productList=Product.getAllProducts();
        Customer c1=new Customer(20L,"Cust1",101);
        orderList.add(new Order(1L,"Confirm",LocalDate.now(),productList,c1));
        orderList.add(new Order(2L,"Pending",LocalDate.now(),200.0));
        orderList.add(new Order(3L,"Pending",LocalDate.now(),300.0));
        return orderList;

    }*/
}
