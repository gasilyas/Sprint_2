package ru.yandex.praktikum.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food [] groceries;

    public ShoppingCart (Food [] groceries) {
        this.groceries = groceries;
    }

    public float getOverallCost() {
        float totalCost = 0f;
        for (int i = 0; i < groceries.length; i++) {
            totalCost += groceries[i].getPrice() * groceries[i].getAmount();
        }
        return totalCost;
    }

    public float getOverallCostWithDiscount() {
        float totalCostDisc = 0f;
        for (int i = 0; i < groceries.length; i++) {
            float discount = groceries[i].getDiscount();
                if (discount > 0) {
                    totalCostDisc += groceries[i].getPrice() * groceries[i].getAmount() * (groceries[i].getDiscount() / 100);
        }
    }
        return totalCostDisc;
}

    public float getOverallCostForVegetarian() {
        float totalCostVeg = 0f;
        for (int i = 0; i < groceries.length; i++) {
            boolean isVegetarian = groceries[i].isVegetarian();
                if (isVegetarian) {
                    totalCostVeg += groceries[i].getPrice() * groceries[i].getAmount();
            }
        }
        return totalCostVeg;
    }
}