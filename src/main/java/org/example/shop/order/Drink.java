package org.example.shop.order;

public final class Drink implements  MenuItem,Alcoholable{
    private int price;
    private String name;
    private StringBuffer other;

    @Override
    public void isAlcoholicDrink() {

    }

    @Override
    public double getAlcoholVol() {
        return 0;
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
