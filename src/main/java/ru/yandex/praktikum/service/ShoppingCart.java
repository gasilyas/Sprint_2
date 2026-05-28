package ru.yandex.praktikum.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food [] groceries;

    public ShoppingCart (Food [] groceries) {
        this.groceries = groceries;
    }

    public float getOverallCost() {
        float totalCost = 0f;
        for (Food item : groceries) {
            float itemCost = item.getPrice() * item.getAmount();
            totalCost += itemCost;
        }
        return totalCost;
    }

    public float getOverallCostWithDiscount() {
        float totalCostDisc = 0f;
        for (Food item : groceries) {
            float discount = item.getDiscount()/100;
            float itemCost = item.getPrice() * item.getAmount();
                if (discount > 0) {
                    totalCostDisc += itemCost * (1-discount);
        } else {
                    totalCostDisc += itemCost;
                }
    }
        return totalCostDisc;
}

    public float getOverallCostForVegetarian() {
        float totalCostVeg = 0f;
        for (Food item : groceries) {
            boolean isVegetarian = item.isVegetarian();
            float itemCost = item.getPrice() * item.getAmount();
                if (isVegetarian) {
                    totalCostVeg += itemCost;
            }
        }
        return totalCostVeg;
    }
}