package org.example.shop;

public class OrderAlreadyAddedException extends Exception {

    public OrderAlreadyAddedException(String message){
        super(message);
    }
}
