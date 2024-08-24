import java.util.List;

public class RestaurantService {

    private RestaurantRepo restaurantRepo;
    
    private Session session;

    public RestaurantService(RestaurantRepo restaurantRepo, Session session) {
        this.restaurantRepo = restaurantRepo;
        this.session = session;
    }

    public void registerRestaurant(int id, String name, List<Rating> rating, List<Long> pincodes, Food food) {
        Restaurant restaurant = new Restaurant(id, name, rating, pincodes, food);
        // save the restaurant
        this.restaurantRepo.save(restaurant);
    }

    public void updateRestaurantFood(int id, Food food) {
        this.restaurantRepo.getRestaurant(id).setFood(food);
    }

    public double getRestaurantRating(int id) {
        List<Rating> rating = this.restaurantRepo.getRestaurant(id).getRating();
        int sum = 0;
        for (Rating r : rating) {
            sum += r.getRating();
        }
        return sum / rating.size();
    }

    public List<Rating> getReviews(int id) {
        return this.restaurantRepo.getRestaurant(id).getRating();
    }

    public void getAllRestaurants() {
        for (Restaurant r : this.restaurantRepo.getAllRestaurants()) {
            if (r.getPincodes().contains(this.session.getCurrentLoggedInUser().getPhone())
                    && r.getFood().getQuantity() != 0) {
                System.out.println(r.getName() + " " + "rating = " + getRestaurantRating(r.getRestaurantId()));
            }
        }
    }
}
