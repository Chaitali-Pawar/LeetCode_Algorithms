import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solver_Find_Majority_Element {


}


class Solve_Find_Majority_Element{

    public int getMajorityElement(int arr[]){
        Map<Integer,Integer> mapOfArray = new HashMap<>();
        int majority_element =0;
        mapOfArray.put(arr[0],0);
        for(int i=1;i<arr.length;i++){
            if(mapOfArray.containsKey(arr[i])){
                int count = mapOfArray.get(arr[i]);
                count = count +1;
                mapOfArray.put(arr[i],count);
            }else{
                mapOfArray.put(arr[i],0);
            }
        }
        for(Integer i : mapOfArray.keySet()){
            if(mapOfArray.get(i) >= (arr.length/2)){
                majority_element =i;
            }
        }
        return majority_element;
    }
}