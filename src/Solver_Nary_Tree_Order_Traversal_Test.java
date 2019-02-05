import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solver_Nary_Tree_Order_Traversal_Test {

    @Test
    public  void test(){
        Solve_Nary_Tree_Order_Traversal solve = new Solve_Nary_Tree_Order_Traversal();
       /* Node node_1_1 = new Node(5,null);
        Node node_1_2 = new Node(6,null);
        List<Node> listOfNodes_2 = new ArrayList<Node>();
        listOfNodes_2.add(node_1_1);
        listOfNodes_2.add(node_1_2);
        Node node_3 = new Node(3,listOfNodes_2);
        List<Node> listOfNodes_1 = new ArrayList<Node>();
        listOfNodes_1.add(node_3);
        Node node_2 = new Node(2,null);
        Node node_1 = new Node(4,null);
        listOfNodes_1.add(node_2);
        listOfNodes_1.add(node_1);
        Node root = new Node(1,listOfNodes_1);
        List<List<Integer>> arrayOfList = solve.levelOrder(root);
        for(List<Integer> list :arrayOfList){
            for(Integer inte :list){
                System.out.println(inte);
            }
        }*/
        Node node_1_1 = new Node(5,null);
        Node node_1_2 = new Node(0,null);
        List<Node> listOfNodes_2 = new ArrayList<Node>();
        listOfNodes_2.add(node_1_1);
        listOfNodes_2.add(node_1_2);
        Node node_10 = new Node(10,listOfNodes_2);
        List<Node> listOfNodes_3 = new ArrayList<Node>();
        Node node_6 = new Node(6,null);
        listOfNodes_3.add(node_6);
        Node node_3 = new Node(3,listOfNodes_3);
        List<Node> listOfNodes_1 = new ArrayList<Node>();
        listOfNodes_1.add(node_10);
        listOfNodes_1.add(node_3);
        Node root = new Node(1,listOfNodes_1);
        List<List<Integer>> arrayOfList = solve.levelOrder(root);
        for(List<Integer> list :arrayOfList){
            for(Integer inte :list){
                System.out.println(inte);
            }
        }
    }
}
