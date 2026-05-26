package ru.yandex.praktikum.model;
import ru.yandex.praktikum.model.constants.Discount;
import ru.yandex.praktikum.model.constants.Colour;

public class Apple extends Food {

    private final String colour;
    public Apple(int amount, float price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if (Colour.RED_COLOUR.equals(colour)) {
            return Discount.RED_APPLES_DISCOUNT;
        }
        return super.getDiscount();
    }
}
