package ru.yandex.praktikum.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food [] groceries;

    public ShoppingCart (Food [] groceries) {
        this.groceries = groceries;
    }

    public float getOverallCost() {
        float total = 0f;
        for (int i = 0; i < groceries.length; i++) {
           total += groceries[i].getPrice() * groceries[i].getAmount();
        }
        return total;
    }

    public float getOverallCostWithDiscount() {
        float total = 0f;
        for (int i = 0; i < groceries.length; i++) {
            float discount = groceries[i].getDiscount();
                if (discount > 0) {
                    total += groceries[i].getPrice() * groceries[i].getAmount() * (groceries[i].getDiscount() / 100);
        }
    }
        return total;
}

    public float getOverallCostForVegetarian() {
        float total = 0f;
        for (int i = 0; i < groceries.length; i++) {
            boolean isVegetarian = groceries[i].isVegetarian();
                if (isVegetarian) {
                total += groceries[i].getPrice() * groceries[i].getAmount();
            }
        }
        return total;
    }
}