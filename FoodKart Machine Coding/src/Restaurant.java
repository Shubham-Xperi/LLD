import java.util.List;

public class Restaurant {
    private int restaurantId;
    private String name;
    private List<Rating> rating;
    private List<Long> pincodes;
    private Food food;

    public Restaurant(int restaurantId, String name, List<Rating> rating, List<Long> pincodes, Food food) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.rating = rating;
        this.pincodes = pincodes;
        this.food = food;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rating> getRating() {
        return rating;
    }

    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }

    public List<Long> getPincodes() {
        return pincodes;
    }

    public void setPincodes(List<Long> pincodes) {
        this.pincodes = pincodes;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}

class Food {
    private int foodId;
    private String name;
    private int price;
    private int quantity;


    public Food(int foodId, String name, int price, int quantity) {
        this.foodId = foodId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}