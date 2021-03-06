import java.util.Arrays;
import java.util.LinkedList;

public class Solve_Compute_Order_Courses {
    int color[];
    int pred[];
    int time =0;
    int start[];
    int finish[];
    LinkedList<Integer> adjListArray[];
    private static final int[] NO_Order = new int[0];
    // to store the order of the vertices once they are finished
    LinkedList<Integer> topologicalSortOrder = new LinkedList<>();
    public int[] findOrder(int numOfCourses,int [][]prerequestie ){
        color  =new int[numOfCourses];
        pred = new int [numOfCourses];
        start = new int[numOfCourses];
        finish = new int[numOfCourses];
        adjListArray = new LinkedList[numOfCourses];

        // intially assign each vertex to color white and make the predecessor of each as -1
        for (int i=0;i<numOfCourses;i++){
            color[i] =0;// color of the vertex
            pred[i] =-1;
            adjListArray[i] = new LinkedList<>();
        }
        for(int i=0;i<prerequestie.length;i++){
            adjListArray[prerequestie[i][0]].add(prerequestie[i][1]);
        }
        int topologicalArray []= new int[numOfCourses];
        for (int i=0;i<numOfCourses;i++){
            // if vertex is white process
            if(color[i] ==0){
                // call DFS to process that vertex
                if(DFS_Vist(i,adjListArray,numOfCourses) == false){
                    return NO_Order;
                }
            }
        }

        int i=0;
        for(Integer v : topologicalSortOrder){
            topologicalArray[i] =v;
            i++;
        }
        return topologicalArray ;
    }

    public boolean DFS_Vist(int vertex ,LinkedList <Integer>adjacencyListArray [],int numofCourses){
        // change color to gray
        color[vertex] =1;
        start[vertex] = ++time;
        // find all the adjacent vertices in the prerequestie array
        LinkedList<Integer> adjacentVertices = adjacencyListArray[vertex];
        for(Integer v : adjacentVertices){
            // if the color of the adjacent vertex is gray that means it is back edge
            // also it means that cycle exists thus no courses can be completed
            if(color[v] == 1){
                return false;
            }
            if(color[v] == 0 &&  !DFS_Vist(v,adjacencyListArray,numofCourses) ){
                // if the vertex is unexplored explore the vertex
                pred[v] =vertex;
                return false;
            }
        }
        finish[vertex] =++time;
        topologicalSortOrder.add(vertex);
        // since vertex is completely explored and all the adjacent vertices are explored change the color to black
        color[vertex] =2;
        return true;
    }
}
