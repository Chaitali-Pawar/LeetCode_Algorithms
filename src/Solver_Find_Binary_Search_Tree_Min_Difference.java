import java.util.ArrayList;
import java.util.List;

public class Solver_Find_Binary_Search_Tree_Min_Difference {
    List<Integer> listOfNodes = new ArrayList<>();
    int diff = Integer.MAX_VALUE;
    public int minDiffInBST(Tree_Node_1 root) {
        inorderTraversal(root);
        for(int i=0;i<listOfNodes.size()-1;i++){
            if(listOfNodes.get(i+1) - listOfNodes.get(i) <diff){
                diff = listOfNodes.get(i+1) - listOfNodes.get(i);
            }
        }
        return diff;
    }

    public void inorderTraversal(Tree_Node_1 root){

        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        listOfNodes.add(root.val);
        inorderTraversal(root.right);
    }
}
