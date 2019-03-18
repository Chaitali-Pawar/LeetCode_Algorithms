import java.util.Arrays;
import java.util.HashSet;

public class Solver_Find_Smalles_Positive {

    public int solution(int[] A) {
        // write your code in Java SE 8
       /*int bulb_set[] = new int[A.length];
       int moments =0;
       for(int i=0;i<A.length;i++){
           bulb_set[A[i]-1] =1;
           int not_set =0;
           for(int j=0;j<i+1;j++){
               if(bulb_set[j]!=1){
                   not_set =1;
                   break;
               }
           }
           if(not_set ==0){
               moments ++;
           }

       }
       return moments;*/
       Arrays.sort(A);
       if(A.length == 1){
           return 0;
       }
       HashSet<Integer> setA = new HashSet<>();
       setA.add(A[0]);
       for(int i=0;i<A.length;i++){
           if(!setA.contains(A[i])){
               setA.add(A[i]);
           }
       }
       if(setA.size() ==1){
           return 0;
       }
       int A_result[] = new int[setA.size()];
       int i=0;
       for(Integer num:setA){
           A_result[i] = num;
           i++;
       }
       int max_distance = Integer.MIN_VALUE;
       int start_rack =0;
       int end_rack=0;
       // find the max distance between 2 consective elements
       for(int j=0;j<A_result.length-1;j++){
           if(A_result[j+1] -A_result[j] > max_distance){
                max_distance = A_result[j+1] -A_result[j];
                start_rack =A_result[j];
                end_rack=A_result[j+1];
           }
       }
    if(end_rack ==0 || start_rack ==0){
        return ((end_rack -start_rack)/2) +1;
    }
    return ((end_rack -start_rack)/2);
    }
}
