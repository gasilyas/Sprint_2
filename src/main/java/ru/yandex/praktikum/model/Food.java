package ru.yandex.praktikum.model;
import ru.yandex.praktikum.model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected float price;
    protected boolean isVegetarian;

    public Food(int amount, float price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public float getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public float getDiscount () {
        return Discount.BASIC_DISCOUNT;
    }
}
