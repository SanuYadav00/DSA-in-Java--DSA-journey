/* write a program to check if therec exists a cycle in the given directed graph */
// O(V+E) no. of vertex and edges
// SC O(V)
import java.util.*;
public class cycle_detection_directed {
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
  graph[0].add(new Edge(0,1));
  graph[2].add(new Edge(2,3));
  graph[1].add(new Edge(1,3));
  
}
public static void BFS(ArrayList<Edge> graph[]) {
  boolean vis[]=new boolean[graph.length];
  for (int i=0;i<graph.length;i++) {
    if (!vis[i]) {
     BFSutil(graph,i,vis);
    }
  }
  System.out.println();
}
public static void BFSutil(ArrayList<Edge> graph[],int idx, boolean vis[]) {
  Queue<Integer> q=new LinkedList<>();
  q.add(idx);
  while (!q.isEmpty()) {
    int curr=q.remove();
    if (!vis[curr]) {
      vis[curr]=true;
      System.out.print(" "+curr);
    
    for (int i=0;i<graph[curr].size();i++) {
      Edge e=graph[curr].get(i);
      q.add(e.dest);
    }
  }
  }
}

public static boolean isCycle(ArrayList<Edge> graph[]) {
boolean vis[]=new boolean[graph.length];
boolean stack[]=new boolean[graph.length];
for (int i=0;i<graph.length;i++) {
  if (!vis[i]) {
    if(isCycleutil(graph,i,vis,stack)) {
      return true;
    }
  }
}
return false;  
}

public static boolean isCycleutil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]) {
  vis[curr]=true;
  stack[curr]=true;
  for (int i=0;i<graph[curr].size();i++) {
    Edge e=graph[curr].get(i);
    if (stack[e.dest]) {
      return true;
    }
    else if(!vis[e.dest] && isCycleutil(graph,e.dest,vis,stack)) {
      return true;
    }

    }
  stack[curr]=false;
  return false;
}




  public static void main(String args[]) {
    /* 
        
       0               0
      / \             / \
    /   \           1    2
    1     3         |    |
     \   /          3----4
      \2/   
*/
  int V=4;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  System.out.print("The BFS traversal is:");
  BFS(graph);
  boolean b=isCycle(graph);
  System.out.println("There exists a cycle in the graph:"+b);
  
} 

}

