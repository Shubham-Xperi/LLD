public class Order {
    private int orderId;
    private int restaurantId;
    private int foodId;
    private int quantity;
    private int totalPrice;
    private String userId;

    public Order(int orderId, int restaurantId, int foodId, int quantity, int totalPrice, String userId) {
        this.orderId = orderId;
        this.restaurantId = restaurantId;
        this.foodId = foodId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}