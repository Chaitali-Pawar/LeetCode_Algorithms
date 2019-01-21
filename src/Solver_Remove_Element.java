import java.io.DataInputStream;
import java.util.Scanner;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class Solver_Remove_Element {

    public static void main(String args[]){
        Solve_Remove_Element solve = new Solve_Remove_Element();
        InputReader ir = new InputReader(new DataInputStream(System.in));
        final int input_arrray_length = ir.readInt();
        int input_array [] = new int[input_arrray_length];
        for(int i =0;i<input_arrray_length;i++){
            input_array[i] =ir.readInt();
        }
        final int value_to_delete = ir.readInt();
        System.out.println(solve.removeElement(input_array,value_to_delete));
    }
}

class Solve_Remove_Element{

    public int removeElement(int [] input_array,int value){

        if(input_array.length ==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<input_array.length;j++){
            if(input_array[j] != value){
                input_array[i] = input_array[j];
                i++;
            }
        }
        return i;
    }
}
