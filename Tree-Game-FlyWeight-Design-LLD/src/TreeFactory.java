import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String, Tree> treeMap;

    public TreeFactory() {
        treeMap = new HashMap<String, Tree>();
    }

    // this working as cache, where we return the tree if we already have that colour in the map
    public Tree getTree(String colour) {
        if (this.treeMap.containsKey(colour)) {
            return this.treeMap.get(colour);
        } else {
            Tree tree = new Tree(colour);
            this.treeMap.put(colour, tree);
            return tree;
        }
    }
}
