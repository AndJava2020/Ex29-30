package org.example.shop.order;


import javafx.scene.control.Menu;
import org.example.shop.customer.Customer;

import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements  Order{
    private int size;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    public InternetOrder(){
    }
    public InternetOrder(MenuItem...menuItems){
        size=menuItems.length;
        for (MenuItem temp: menuItems
             ) {
            add(temp);
        }
    }

    @Override
    public boolean add(MenuItem item) {
        if(head==null){
            head=new ListNode();
            head.value=item;
            head.next=tail;
        }
        else{//создаать объект
            tail = new ListNode();
            tail.value=item;
            tail=tail.next;
        }

        return false;
    }

    @Override
    public String[] itemsNames() {
        ListNode temp=head;
        String [] names= new String[size];
        int i=0;
        while (temp.next!=null){
            names[i]=temp.value.getName();
            i++;
        }
        return names;
    }

    @Override
    public int itemQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int i=0;
        ListNode temp=head;
        while (temp.next!=null){
            if(temp.value.getName()==itemName) return temp.value.getCost();
            temp=temp.next;
            i++;
        }
        return -1;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        ListNode temp=head;
        while (temp.next!=null){
            if(temp.value==item) return temp.value.getCost();
            temp=temp.next;
        }
        return -1;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[]menuItems=new MenuItem[size];

        ListNode temp=head;
        int i=0;
        while (temp.next!=null){
            menuItems[i]=temp.value;
            temp=temp.next;
            i++;

        }

        return menuItems;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode temp=head;
        ListNode last=null;
        while (temp.next!=null){
            if(temp.value.getName()==itemName) {
                last.next=temp.next;
                return true;
            }
            last=temp;
            temp=temp.next;
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {

        ListNode temp=head;
        ListNode last=null;
        while (temp.next!=null){
            if(temp.value==item) {
                last.next=temp.next;
                return true;
            }
            last=temp;
            temp=temp.next;
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int i=0;
        ListNode temp=head;
        ListNode last=null;
        while (temp.next!=null){
            if(temp.value.getName()==itemName) {
                last.next=temp.next;
                i++;
            }
            last=temp;
            temp=temp.next;
        }
        return i;
    }

    @Override
    public int removeAll(MenuItem item) {
        int i=0;
        ListNode temp=head;
        ListNode last=null;
        while (temp.next!=null){
            if(temp.value==item) {
                last.next=temp.next;
                i++;
            }
            last=temp;
            temp=temp.next;
        }
        return i;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] menuItems = getItems();
        Arrays.sort(menuItems, new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem o1, MenuItem o2) {
                return o1.getCost()-o2.getCost();
            }
        });
        return menuItems;
    }

    @Override
    public int costTotal() {
        MenuItem[] menuItems = getItems();
        int cost=0;
        for (MenuItem temp: menuItems
             ) {
            cost+=temp.getCost();

        }
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer=customer;
    }


    class ListNode implements Cloneable{
        protected ListNode next;
        protected MenuItem value;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
