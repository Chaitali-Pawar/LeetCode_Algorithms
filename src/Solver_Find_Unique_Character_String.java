import java.util.LinkedHashMap;

public class Solver_Find_Unique_Character_String {
}

class Solve_Find_Unique_Character_String{

    public int firstUniqCharacter(String s){
       char input_array [] = s.toCharArray();
       LinkedHashMap<Character,Integer> mapOfString = new LinkedHashMap<Character,Integer>();
       for(int i=0;i<input_array.length;i++){
           if(mapOfString.containsKey(input_array[i])){
               mapOfString.put(input_array[i],mapOfString.get(input_array[i]) +1);
           }
           else{
               mapOfString.put(input_array[i],0);
           }
       }
       for(Character key:mapOfString.keySet()){
           if(mapOfString.get(key) == 0){
               return s.indexOf(key);
           }
       }
       return -1;
    }
}
