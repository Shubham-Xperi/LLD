import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderRepo {

    private List<Order> orderDb;


    public OrderRepo() {
        orderDb = new ArrayList<>();
    }

    public void save(Order order) {
        this.orderDb.add(order);
    }

    public List<Order> getOrderForUser(String phone) {
        return this.orderDb.stream()
                .filter(order -> order.getUserId().equals(phone))
                .collect(Collectors.toList());
    }
}
