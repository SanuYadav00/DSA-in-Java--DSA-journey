/* Write a program to find all the strongly connected components of a directed graph using
 Kosaraju's Algorithm.
 */
// TC O(v+e)+O(v+e)+O(v+e)=O(V+E)
import java.util.*;
public class kosaraju_algorithm_for_strongly_connected_component {
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
  graph[0].add(new Edge(0,2));
  graph[0].add(new Edge(0,3));
  graph[1].add(new Edge(1,0));
  graph[2].add(new Edge(2,1));
  graph[3].add(new Edge(3,4));
  }

  public static void kosaraju(ArrayList<Edge> graph[]) {
    // Step1
    Stack<Integer> s=new Stack<>();
    boolean vis[]=new boolean[graph.length];
    for (int i=0;i<graph.length;i++) {
      if (!vis[i]) {
        topological_sort(graph,s,vis,0);
      }
    }

    // step 2
    ArrayList<Edge> tgraph[]=new ArrayList[graph.length]; // transposed graph
    transpose(graph,tgraph,vis); // we pass vis to make it false for every index so that we can use it again for other operations

    //step 3
    System.out.println("All the strongly connected components are:");
    while(!s.isEmpty()) {
      int curr=s.pop();
      if (!vis[curr]) {
      DFS(tgraph,vis,curr);
      System.out.println();
      }
    }
  }

  public static void DFS(ArrayList<Edge> tgraph[],boolean vis[], int curr) {
      vis[curr]=true;
      System.out.print(" "+curr);
      for (int i=0;i<tgraph[curr].size();i++) {
        Edge e=tgraph[curr].get(i);
        if (!vis[e.dest]) {
        DFS(tgraph,vis,e.dest);
        }
      }
    
  }
  
  public static void transpose(ArrayList<Edge> graph[],ArrayList<Edge> tgraph[],boolean vis[]) {
    for (int i=0;i<tgraph.length;i++) {
      tgraph[i]=new ArrayList<>();
      vis[i]=false; 
    }
    for (int i=0;i<tgraph.length;i++) {
      for (int j=0;j<graph[i].size();j++) {
        Edge e=graph[i].get(j);
        tgraph[e.dest].add(new Edge(e.dest,e.src)); // reverse edge
      }
    }
  }


  public static void topological_sort(ArrayList<Edge> graph[], Stack<Integer> s, boolean vis[], int curr) {
           vis[curr]=true;
           for (int i=0;i<graph[curr].size();i++) {
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]) {
              topological_sort(graph,s,vis,e.dest);
            }
           }
           s.push(curr);
  }
  
  public static void main(String args[]) {
    int V=5;
    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    kosaraju(graph);
    
    
  } 
  
}
