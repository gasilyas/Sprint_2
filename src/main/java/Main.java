import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED_COLOUR);
        Food greenApples = new Apple(8, 60, Colour.GREEN_COLOUR);

        Food[] groceries = new Food[] {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(groceries);

        System.out.println("Общая стоимость товаров без скидки составляет: " + cart.getOverallCost() + " руб.");
        System.out.println("Общая стоимость товаров с учетом скидки составляет: " + cart.getOverallCostWithDiscount() + " руб.");
        System.out.println("Общая стоимость товаров для вегетарианцев составляет: " + cart.getOverallCostForVegetarian() + " руб.");
    }
}
