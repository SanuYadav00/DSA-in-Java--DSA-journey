/* Write a code to perform topological sorting in a DAG */
// O(V+E) no. of vertex and edges
import java.util.*;
public class topological_sorting {
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

  public static void topological_sort(ArrayList<Edge> graph[], Stack<Integer> s) {
     boolean vis[]=new boolean[graph.length];
     for (int i=0;i<graph.length;i++) {
      if (!vis[i]) {
        sort(graph,s,i,vis);
      }
     }
  }
  public static void sort(ArrayList<Edge> graph[],Stack<Integer> s,int curr,boolean vis[]) {
    vis[curr]=true;
    for (int i=0;i<graph[curr].size();i++) {
      Edge e=graph[curr].get(i);
      if (!vis[e.dest]) {
      sort(graph,s,e.dest,vis);
      }
    }
    s.push(curr);
  }


  public static void main(String args[]) {
  int V=6;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  Stack<Integer> s=new Stack<>();
  topological_sort(graph,s);
  System.out.print("The vertices in order of topological sort are:");
  while(!s.isEmpty()) {
    System.out.print(" "+s.pop());
  }
  System.out.println();
  
} 

}


