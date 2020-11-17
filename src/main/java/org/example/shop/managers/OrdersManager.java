package org.example.shop.managers;

import javafx.scene.control.MenuItem;
import org.example.shop.order.Order;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
