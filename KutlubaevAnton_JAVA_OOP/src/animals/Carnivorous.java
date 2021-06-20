package animals;

import foods.Food;
import foods.Meat;

public abstract class Carnivorous extends Animal {
    public abstract String getName();

    @Override
    public String eat(Food food) {

        if (food instanceof Meat) {
            return " съела " + food.getName();
        } else {
            return " не ест " + food.getName();
        }
    }
}
