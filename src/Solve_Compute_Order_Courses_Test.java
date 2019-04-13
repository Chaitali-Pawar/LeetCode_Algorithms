import org.junit.Test;

public class Solve_Compute_Order_Courses_Test {
    @Test
    public void test(){
        Solve_Compute_Order_Courses solve = new Solve_Compute_Order_Courses();
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
        int []sortOderArray=solve.canFinish(2,pre_1);
        for(int i=0;i<sortOderArray.length;i++){
            System.out.println(sortOderArray[i]);
        }
    }
}
