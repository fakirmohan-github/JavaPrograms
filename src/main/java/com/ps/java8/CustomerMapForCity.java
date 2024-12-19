package com.ps.java8;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerMapForCity {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();

        address1.setPincode(111111l);
        address1.setCity("ABC");
        address2.setPincode(222222l);
        address2.setCity("PQR");
        address3.setPincode(333333l);
        address3.setCity("XYZ");

        customer1.setName("Ram");
        customer1.setCustId("r123");
        customer1.setListOfAddr(Arrays.asList(address1, address2));

        customer2.setCustId("k123");
        customer2.setName("Kanha");
        customer2.setListOfAddr(Arrays.asList(address2, address3));

        customer3.setCustId("p123");
        customer3.setName("CA-Pradeep");
        customer3.setListOfAddr(Arrays.asList(address3, address1));

        List<Customer> customerList = Arrays.asList(customer1, customer2, customer3);
        Long inputPincode = 222222l;

        Map<Long, List<Customer>> listMap = findMapOfCustomersWithPinCode(customerList, inputPincode);
        System.out.println("listMap"+listMap);

        Map<Long, List<Customer>> customerMapWithPinCode = findCustomersGroupByPincode(customerList);
        System.out.println("customerMapWithPinCode "+customerMapWithPinCode);

    }

    private static Map<Long, List<Customer>> findCustomersGroupByPincode(List<Customer> customerList) {
        return customerList.stream()
                .flatMap(customer -> customer.getListOfAddr().stream()
                        .map(address -> new AbstractMap.SimpleEntry<>(address.getPincode(), customer)))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
    }


    private static Map<Long, List<Customer>> findMapOfCustomersWithPinCode(List<Customer> customerList, Long inputPincode) {
        return customerList.stream()
                .filter(customer -> customer.getListOfAddr().stream()
                        .anyMatch(address -> address.getPincode().equals(inputPincode)))
                .collect(Collectors.groupingBy(customer -> inputPincode));
    }


}