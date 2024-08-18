import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Tree> trees;
    List<TreePosition> treePositions;
    TreeFactory treeFactory;

    public Game() {
        trees = new ArrayList<Tree>();
        treePositions = new ArrayList<TreePosition>();
        treeFactory = new TreeFactory();
    }

    public void addTree(String colour, int x, int y) {
        Tree tree = treeFactory.getTree(colour);
        TreePosition treePosition = new TreePosition(x, y);
        trees.add(tree);
        treePositions.add(treePosition);
        render(trees.size());
    }

    public void render(int id) {
        System.out.println("Tree " + id + " is " + trees.get(id - 1).getColour() + " and is "
                + trees.get(id - 1).getHeight() + " feet tall" + " at position "
                + treePositions.get(id - 1).getCoordinates().getFirst() + ", "
                + treePositions.get(id - 1).getCoordinates().getSecond());
    }
}
