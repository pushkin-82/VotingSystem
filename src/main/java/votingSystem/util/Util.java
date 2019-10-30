package votingSystem.util;

import votingSystem.dto.RestaurantTo;
import votingSystem.model.Dish;
import votingSystem.model.Restaurant;
import votingSystem.model.User;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Util {

    public static boolean isEnabledToChoice(LocalTime lt, User user) {
        return !user.isEnabled() || lt.compareTo(LocalTime.of(11, 0)) <= 0;
    }

    public static Set<Dish> getMenu(RestaurantTo restaurant) {
        //number of dishes should be from 2 to 5 inclusive
        int numberOfDishes = new Random().nextInt(4) + 2;

        Set<Dish> dishes = new HashSet<>();

        for (int i = 0; i < numberOfDishes; i++) {
            int randomDishOrdinal = new Random().nextInt(Dish.values().length);
            Dish randomDish = Dish.values()[randomDishOrdinal];

            if (!dishes.contains(randomDish)) {
                dishes.add(randomDish);
            } else {
                i--;
            }
        }

        restaurant.setMenu(dishes);
        return dishes;
    }
}
