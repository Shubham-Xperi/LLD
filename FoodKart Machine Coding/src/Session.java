public class Session {

    private User currentLoggedInUser;

    public Session() {
        currentLoggedInUser = null;
    }

    public User getCurrentLoggedInUser() {
        return currentLoggedInUser;
    }

    public void setCurrentLoggedInUser(User currentLoggedInUser) {
        this.currentLoggedInUser = currentLoggedInUser;
    }
}
