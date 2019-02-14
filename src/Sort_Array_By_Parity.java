import java.util.ArrayList;
import java.util.List;


public  class Sort_Array_By_Parity {


    public int[] sortArrayByParity(int[] A) {
        int output_array[] = new int[A.length];
        List<Integer> odd_List = new ArrayList<>();
        int j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]% 2 !=0){
                odd_List.add(A[i]);
            }else{
                output_array[i] =A[i];
                j++;
            }
        }
        for(Integer number :odd_List){
            output_array[j] =number;
            j++;
        }
        return output_array;
    }
}
