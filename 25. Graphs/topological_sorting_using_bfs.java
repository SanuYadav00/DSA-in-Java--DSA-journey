/* Write a code to perform topological sorting using bfs in a DAG */
// O(V+E) no. of vertex and edges
import java.util.*;
public class topological_sorting_using_bfs {
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
  }
  public static void calcIndegree(ArrayList<Edge> graph[],int in_degree[]) {
    for (int i=0;i<graph.length;i++) {
      for (int j=0;j<graph[i].size();j++) {
        Edge e=graph[i].get(j);
        in_degree[e.dest]++;
      }
  }
  }
  public static void topological_sort(ArrayList<Edge> graph[]) {
    int in_degree[]=new int [graph.length];
  Queue<Integer> q=new LinkedList<>();
  calcIndegree(graph,in_degree);
  for (int i=0;i<in_degree.length;i++) {
    if (in_degree[i]==0) {
      q.add(i);
    }
  }
  while (!q.isEmpty()) {
    int curr=q.remove();
    System.out.print(" "+curr);
    for (int i=0;i<graph[curr].size();i++) {
      Edge e=graph[curr].get(i);
      in_degree[e.dest]--;
      if (in_degree[e.dest]==0) {
      q.add(e.dest);
      }
    }
  }
}
 

  public static void main(String args[]) {
  int V=6;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  System.out.print("The vertices in order of topological sort are:");
  topological_sort(graph);
  System.out.println();
  
} 

}


