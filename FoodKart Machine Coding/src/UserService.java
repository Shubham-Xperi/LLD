import java.util.List;

public class UserService {

    private Session session;

    private UserRepo userRepo;

    private RestaurantRepo restaurantRepo;

    private OrderRepo orderRepo;

    public UserService(Session session, UserRepo userRepo, RestaurantRepo restaurantRepo, OrderRepo orderRepo) {
        this.session = session;
        this.userRepo = userRepo;
        this.restaurantRepo = restaurantRepo;
        this.orderRepo = orderRepo;
    }

    public void registerUser(String name,  String gender, String phone, Long pincode) {
        User user = new User(name, gender, phone, pincode);
        this.userRepo.save(user);
        System.out.println("User registered successfully and logged in");
        this.session.setCurrentLoggedInUser(user);
    }

    public void loginUser(String phone) {
        User user = this.userRepo.getUser(phone);
        if (user != null) {
            System.out.println("Logging out the current user "
                    + this.session.getCurrentLoggedInUser().getName());
            System.out.println("User logged-in successfully - " + this.session.getCurrentLoggedInUser().getName());
            this.session.setCurrentLoggedInUser(user);
        } else {
            System.out.println("User not found");
        }
    }

    public void rateRestaurant(int id, int rating, String comment) {
        this.restaurantRepo.getRestaurant(id).getRating().add(new Rating(comment, rating));
    }

    public Order makeOrder(int orderId, int restaurantId, int quantity) {
        Food food = this.restaurantRepo.getRestaurant(restaurantId).getFood();
        Order order = new Order(orderId, restaurantId,
                food.getFoodId(), quantity,
                quantity*food.getPrice(),
                this.session.getCurrentLoggedInUser().getPhone());
        this.orderRepo.save(order);
        return order;
    }

    public void getOrders() {
        List<Order> orderForUser = this.orderRepo
                .getOrderForUser(session.getCurrentLoggedInUser().getPhone());
        System.out.println("-----Your list of orders are below-----");
        for (Order order : orderForUser) {
            System.out.println(order.getFoodId() + " "
                    + order.getQuantity() + " "
                    + order.getTotalPrice());
        }
        System.out.println("-----End of Order-----");
    }

}
