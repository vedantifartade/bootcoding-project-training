package com.online.restuarent.app;

import com.online.restuarent.Customer;
import com.online.restuarent.Vendor;
import com.online.restuarent.Order;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        Customer ramesh = new Customer();
        ramesh.setName("Ramesh");
        ramesh.setCity("Nagpur");
        ramesh.setAddress("New Nandanwan, Nagpur");
        ramesh.setState("Maharashtra");
        ramesh.setEmailId("abc@gmail.com");
        ramesh.setPhoneNumber("9090909090L");

        System.out.println("Name:" + ramesh.getName());
        System.out.println("City:" + ramesh.getCity());
        System.out.println("Address:" + ramesh.getAddress());
        System.out.println("State:" + ramesh.getState());
        System.out.println("Email Id:" + ramesh.getEmailId());
        System.out.println("Phone:" + ramesh.getPhoneNumber());

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni Square, Nagpur");
        haldiram.setCategory("Veg");
        haldiram.setPhoneNumber(0712223344);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name:" + haldiram.getName());
        System.out.println("Address:" + haldiram.getAddress());
        System.out.println("Category:"+ haldiram.getCategory());
        System.out.println("Phone:" + haldiram.getPhoneNumber());
        System.out.println("Rating :"+ haldiram.getRating());
        System.out.println("State  :"+ haldiram.getState());
        System.out.println("City:" + haldiram.getCity());

        Order order = new Order();
        order.setCustomer(ramesh);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101,Civil Lines,Nagpur");


    }
}
