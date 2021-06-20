package animals;

import foods.Food;
import foods.Grass;

public abstract class Herbivore extends Animal {
    public abstract String getName();

    @Override
    public String eat(Food food) {

        if (food instanceof Grass) {
            return " съела " + food.getName();
        } else {
            return " не ест " + food.getName();
        }
    }
}
