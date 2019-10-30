package votingSystem;

import votingSystem.dto.RestaurantTo;
import votingSystem.util.Util;

public class Main {

    public static void main(String[] args) {
        RestaurantTo restaurantTo = new RestaurantTo();
        Util.getMenu(restaurantTo).forEach(System.out::println);
    }
}
