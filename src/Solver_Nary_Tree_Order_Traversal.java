import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solver_Nary_Tree_Order_Traversal {
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
class Solve_Nary_Tree_Order_Traversal{

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> listOfNodes = new ArrayList<>();
        if(root ==null){
            return listOfNodes;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        listOfNodes.add(list);
        while(!queue.isEmpty()){
            Node currentNode = ((LinkedList<Node>) queue).getFirst();
            List<Integer> list_of_children = new ArrayList<>();
            if(currentNode.children !=null){
                for(Node e : currentNode.children){
                    queue.add(e);
                    list_of_children.add(e.val);
                }
                listOfNodes.add(list_of_children);
            }
            ((LinkedList<Node>) queue).removeFirst();
        }
        System.out.println(listOfNodes.size());
        return listOfNodes;
    }

}