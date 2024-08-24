import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestaurantRepo restaurantRepo = new RestaurantRepo();
        OrderRepo orderRepo = new OrderRepo();
        Session session = new Session();
        RestaurantService restaurantService = new RestaurantService(restaurantRepo, session);
        UserService userService = new UserService(session, new UserRepo(), restaurantRepo, orderRepo);

        userService.registerUser("Shubham", "Male", "9876543210", 123456L);
        userService.registerUser("Anish", "Male", "9876543211", 123456L);
        userService.registerUser("Raj", "Male", "9876543212", 123456L);

        restaurantService.registerRestaurant(1, "Pizza Hut", new ArrayList<>(), new ArrayList<>(), new Food(1, "Pizza", 10, 10));
        restaurantService.registerRestaurant(2, "Burger King", new ArrayList<>(), new ArrayList<>(), new Food(2, "Burger", 10, 10));
        restaurantService.registerRestaurant(3, "Dominos", new ArrayList<>(), new ArrayList<>(), new Food(3, "Pasta", 10, 10));

        userService.loginUser("9876543210");
        restaurantService.getAllRestaurants();
        userService.makeOrder(1, 1, 3);
        userService.makeOrder(2, 2, 2);

        // login in different user
        userService.loginUser("9876543211");
        restaurantService.getAllRestaurants();
        userService.makeOrder(3, 3, 1);

        userService.getOrders();
        userService.loginUser("9876543210");
        userService.getOrders();
    }
}