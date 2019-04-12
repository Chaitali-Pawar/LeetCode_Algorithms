import org.junit.Assert;
import org.junit.Test;

public class Solve_Graph_DFS_Topological_Sort_Test {
    @Test
    public void test (){
        Solve_Graph_DFS_Topological_Sort solve = new Solve_Graph_DFS_Topological_Sort();
        int pre [][] = new int[4][2];
        pre[0][0] =1;
        pre[0][1] =0;
        pre[1][0] =1;
        pre[1][1] =2;
        pre[2][0] =1;
        pre[2][1] =3;
        pre[3][0] =2;
        pre[3][1] =0;
        int pre_1 [][] = new int[2][2];
        pre_1[0][0] =1;
        pre_1[0][1] =0;
        pre_1[1][0] =0;
        pre_1[1][1] =1;
        int pre_2 [][] = new int[1][2];
        pre_2[0][1] =1;
        pre_2[1][0] =0;
        solve.canFinish(2,pre_2);
        //Assert.assertEquals(solve.canFinish(2,pre_1,),true);
        //Assert.assertEquals(solve.canFinish(4,pre),false);
    }
}
