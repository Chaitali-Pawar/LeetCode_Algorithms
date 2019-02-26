import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solver_Minimum_Time_Difference {
    public int findMinDifference(List<String> timePoints) {
        int time_array [] = new int[timePoints.size()];
        int i=0;
        for(String time :timePoints){
           int hours =0;
           int mins =0;
           String[] array = time.split(":");
           if(Integer.parseInt(array[0]) >=12){
               hours = Integer.parseInt(array[0]) -12;
           }else{
               hours = Integer.parseInt(array[0]) +12;
           }

            time_array [i]=hours*60 + Integer.parseInt(array[1]);
            i++;
        }
        Arrays.sort(time_array);
        int minDiff = time_array[1]-time_array[0];
        for (int j = 2 ; j != time_array.length ; j++) {
            minDiff = Math.min(minDiff, time_array[j]-time_array[j-1]);
        }
        return minDiff;
    }
}
