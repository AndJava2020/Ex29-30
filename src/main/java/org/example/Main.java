package org.example;

import org.example.shop.IllegalTableNumberException;
import org.example.shop.OrderAlreadyAddedException;
import org.example.shop.managers.TableOrdersManager;
import org.example.shop.order.Dish;
import org.example.shop.order.TableOrder;

public class Main {
    public static void main(String[] args)  {
        Dish dish=new Dish("n",1,new StringBuffer("fsdf"));

        Dish dish2=new Dish("n",-1,null); //исключение в конструктуре из-за неверного ввода

        TableOrdersManager tableOrdersManager=new TableOrdersManager();

        try {//throws - когда отвественность за исключение передаём вызывающему метод;
            tableOrdersManager.add(null,-1); //через метод (оповещение), требуется обязательно обработчик
        } catch (IllegalTableNumberException e) {
            e.printStackTrace();
        }

        if(5>4)
            try {
                throw new OrderAlreadyAddedException("столик занят");
            } catch (OrderAlreadyAddedException e) {
                e.printStackTrace();
            }

    }
}
