import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> userDb;

    public UserRepo() {
        userDb = new ArrayList<>();
    }

    public void save(User user) {
        this.userDb.add(user);
    }

    public User getUser(String phone) {
        return this.userDb.stream()
                .filter(user -> user.getPhone().equals(phone))
                .findFirst()
                .orElse(null);
    }
}
