public class Main {
    public static void main(String[] args) {

        // This program is to showcase flyweight design pattern
        // here we have added a tree factory which returns the same object for the same colour to save memory and time.

        // Start rendering trees
        Game game = new Game();
        game.addTree("Brown", 1, 3);
        game.addTree("Green", 2, 4);
        game.addTree("Brown", 3, 5);
        game.addTree("Brown", 4, 6);
        game.addTree("Green", 5, 7);
        game.addTree("Green", 6, 8);
    }
}