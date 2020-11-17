package org.example.shop.order;

public final class Dish implements MenuItem {
    private int price;
    private String name;
    private StringBuffer other;
    public Dish(String name, int price, StringBuffer other){
        if(price<0 || name.equals("") || other.equals("")) throw new java.lang.IllegalArgumentException();
        this.name=name;
        this.price=price;
        this.other=other;

    }

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public StringBuffer getDescription() {
        return other;
    }
}
