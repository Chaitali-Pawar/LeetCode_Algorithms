import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solver_K_Closet_Point_Origin {
    public int[][] kClosest(int[][] points, int K) {
        double distance[] = new double[points.length];
        for(int i =0;i<points.length;i++){
                int pointx= points[i][0];
                int pointy =points[i][1];
                distance[i] = calculateDistance(pointx,pointy);
        }
        /*
        the below implementation results in anO(n^2) time complexity

        while(K!=0){
            min_distance = Double.MAX_VALUE;
            for(int i=0;i<distance.length;i++){
                if(distance[i] <min_distance){
                    min_distance =distance[i];
                    min_distance_index=i;
                }
            }
            result[K-1][0]= points[min_distance_index][0];
            result[K-1][1]= points[min_distance_index][1];
            distance[min_distance_index] =Double.MAX_VALUE;
            K--;
        }*/
        int[][] result = new int[K][2];
        // another approach is to sort the array and find the points in points array with distance
        // less than K
        Arrays.sort(distance);
        int j=0;
        for(int i=0;i<points.length;i++){
            if(calculateDistance(points[i][0],points[i][1]) < distance[K]){
                result[j][0]=points[i][0];
                result[j][1]=points[i][1];
                j++;
            }
        }

    return result;
    }

    public double calculateDistance(int point_x, int point_y){
        return  Math.sqrt((point_y*point_y + point_x*point_x) );
    }
}

