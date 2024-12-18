/* Write a code to find all paths from source to target */
// O(V^V) no. of vertex and edges
import java.util.*;
public class all_paths_from_source_to_target {
  static class Edge {
    int src;
    int dest;
    public Edge(int s, int d) {
      this.src=s;
      this.dest=d;
    }
  }

  static void createGraph(ArrayList<Edge> graph[]) {
    for (int i=0;i<graph.length;i++) {
      graph[i]=new ArrayList<>();
    }
  graph[5].add(new Edge(5,0));
  graph[5].add(new Edge(5,2));
  graph[4].add(new Edge(4,0));
  graph[4].add(new Edge(4,1));
  graph[2].add(new Edge(2,3));
  graph[3].add(new Edge(3,1));
  graph[0].add(new Edge(0,3));
  }
  public static void paths(ArrayList<Edge> graph[],String path,int s,int d) {
    if (s==d) {
      System.out.println(path+d);
      return; 
    }
    for (int i=0;i<graph[s].size();i++) {
       Edge e=graph[s].get(i);
       paths(graph,path+s,e.dest,d);
    }
  }
 

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
  int V=6;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  System.out.print("Enter the source:");
  int s=sc.nextInt();
  System.out.print("Enter the destination:");
  int d=sc.nextInt();
  System.out.print("The paths are:");
  paths(graph,"",s,d);
  sc.close();
  
} 

}


