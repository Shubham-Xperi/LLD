import java.util.ArrayList;
import java.util.List;

public class RestaurantRepo {
    private List<Restaurant> restaurantDb;

    public RestaurantRepo() {
        restaurantDb = new ArrayList<>();
    }

    public void save(Restaurant Restaurant) {
        this.restaurantDb.add(Restaurant);
    }

    public Restaurant getRestaurant(int id) {
        return this.restaurantDb.stream()
                .filter(Restaurant -> Restaurant.getRestaurantId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Restaurant> getAllRestaurants() {
        return this.restaurantDb;
    }
}
