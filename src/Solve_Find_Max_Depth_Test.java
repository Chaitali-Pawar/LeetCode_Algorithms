import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solve_Find_Max_Depth_Test {

    @Test
    public void test(){
        Solve_Find_Max_Depth solve = new Solve_Find_Max_Depth();
        Node node_6 = new Node(6,null);
        Node node_0 = new Node(0,null);
        Node node_5 = new Node(5,null);
        List<Node> list_left = new ArrayList<>();
        List<Node> list_right = new ArrayList<>();
        list_left.add(node_0);
        list_left.add(node_5);
        list_right.add(node_6);
        Node node_10 = new Node(10,list_left);
        Node node_3= new Node(3,list_right);
        List<Node> level_one = new ArrayList<>();
        level_one.add(node_10);
        level_one.add(node_3);
        Node root = new Node(1,level_one);
        System.out.println(solve.maxDepth(root));
    }
}
