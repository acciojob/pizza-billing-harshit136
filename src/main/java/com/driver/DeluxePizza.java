package com.driver;

public class DeluxePizza extends Pizza {

    int price;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
