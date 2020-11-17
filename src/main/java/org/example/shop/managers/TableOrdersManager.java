package org.example.shop.managers;

import org.example.shop.IllegalTableNumberException;
import org.example.shop.order.MenuItem;
import org.example.shop.order.Order;

import java.util.HashMap;

public class TableOrdersManager implements OrdersManager {
    HashMap<String,Order> orders=new HashMap<>();
    public  void add(Order order, int tableNumber) throws IllegalTableNumberException {
        if(tableNumber<0) throw new IllegalTableNumberException("Нет такого столика");


    };
    public  void addItem(MenuItem item, int tableNumber){};
    public  int freeTableNumber(){ return  0;};
    public  int [] freeTableNumbers(){ return  new int[1];};
    public Order getOrder(int tableNumber){ return null;};
    public void remove(int tableNumber){};
    public int remove(Order order){return 0;};
    public int removeAll(Order order){ return 0;};

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(javafx.scene.control.MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
