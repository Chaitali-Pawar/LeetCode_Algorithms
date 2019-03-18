public class Solver_Pre_Order_Traversal_Paranthesis {
    StringBuilder result = new StringBuilder();
    public String tree2str(Tree_Node_1 t) {
        preOrderTreeTraversal(t,true);
        return result.toString();
    }

    public void preOrderTreeTraversal(Tree_Node_1 treeNode,boolean isRoot){
        if(treeNode ==null){
            return ;
        }
        if(isRoot){
            result.append(treeNode.val);
        }else{
            result.append("("+treeNode.val);
        }
        if(treeNode.left == null && treeNode.right!=null){
            result.append("()");
        }
        preOrderTreeTraversal(treeNode.left,false);
       // result.append(")");
        preOrderTreeTraversal(treeNode.right,false);
        result.append(")");

    }

}
