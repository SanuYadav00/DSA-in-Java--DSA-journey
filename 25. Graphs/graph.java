/* Write a program to show the basics of a graph */
import java.util.*;
public class graph {
  static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int s, int d, int w) {
      this.src=s;
      this.dest=d;
      this.wt=w;
    }
  }
  public static void main(String args[]) {
    /*       (5)
          0--------1
                  / \
              (1)/   \(3)
                /     \
               2------ 3                                             
              /    (1)
          (2)/
            /
           4
*/
  int V=5;
  // int arr[]=new int[n] array define process
  ArrayList<Edge>[] graph=new ArrayList[V]; // graph is a array of arraylits of type edge
  // array elements are null at present->we need to amke them empty arraylist
  for (int i=0;i<V;i++) {
    graph[i]=new ArrayList<>();
  }

  // for 0-vertex
  graph[0].add(new Edge(0,1,5));

  // for 1-vertex
  graph[1].add(new Edge(1,0,5));
  graph[1].add(new Edge(1,2,1));
  graph[1].add(new Edge(1,3,3));
 
  // for 2-vertex
  graph[2].add(new Edge(2,1,1));
  graph[2].add(new Edge(2,4,2));
  graph[2].add(new Edge(2,3,1));

  // for 3-vertex
  graph[3].add(new Edge(3,1,3));
  graph[3].add(new Edge(3,2,1));

  // for 4-vertex
  graph[4].add(new Edge(4,2,2));

  // 2's neighbours
  System.out.print("The neighbours of 2 are:");
  for (int i=0;i<graph[2].size();i++) {
     Edge e=graph[2].get(i);
     System.out.println(e.dest);
  }
}

}