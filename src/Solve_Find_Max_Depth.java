import java.util.List;

public class Solve_Find_Max_Depth {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int depth = 1;
        for (Node node : root.children) {
            depth = Math.max(depth, maxDepth(node) + 1);
        }
        return depth;
    }
}


