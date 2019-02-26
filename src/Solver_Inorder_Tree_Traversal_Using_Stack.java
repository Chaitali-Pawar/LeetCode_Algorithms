import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solver_Inorder_Tree_Traversal_Using_Stack {

    public List<Integer> inorderTraversal(Tree_Node_1 root) {
        List<Integer> inorderTreeTraversal = new ArrayList<>();
        Tree_Node_1 currentNode = root;
        Stack<Tree_Node_1> stack = new Stack<>();
        while(currentNode!=null || stack.size()>0){

            while(currentNode!=null){
                stack.push(currentNode);
                currentNode =currentNode.left;
            }
            currentNode =stack.pop();
            inorderTreeTraversal.add(currentNode.val);
            currentNode=currentNode.right;
        }
        return inorderTreeTraversal;
    }
}
