public class Solver_Find_Same_Tree {

    public static void main(String args[]){
        Tree_Node test_1 = new  Tree_Node(1);
        test_1.right=new Tree_Node(1);
        test_1.left= new Tree_Node(2);
        test_1.left.left = new Tree_Node(3);
        Tree_Node test_2 = new  Tree_Node(1);
        test_2.right=new Tree_Node(1);
        test_2.left= new Tree_Node(2);
        test_1.left.right = new Tree_Node(3);
        Find_Same_Tree find = new Find_Same_Tree();
        boolean result =find.isSameTree(test_1,test_2);
        System.out.println(result);
    }

}

class Find_Same_Tree{
    public boolean isSameTree(Tree_Node p, Tree_Node q){
      if(p == null && q==null){
          return true;
      }
      // if not empty
        if(p !=null && q!=null){
            return((p.value == q.value) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right) );
        }else{
            return false;
        }
    }
}


