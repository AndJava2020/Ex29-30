package org.example.shop.order;


import org.example.shop.customer.Customer;
import org.example.shop.managers.OrdersManager;

public interface Order{
    boolean add(MenuItem item);
    String [] itemsNames();
    int itemQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    MenuItem [] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);


}
