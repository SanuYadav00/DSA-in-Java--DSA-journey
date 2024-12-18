/* write a program in java to return true if there is a cycle in graph using dfs */
// O(V+E) no. of vertex and edges
import java.util.*;
public class cycle_detection_using_dfs {
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

  static void createGraph(ArrayList<Edge> graph[]) {
    for (int i=0;i<graph.length;i++) {
      graph[i]=new ArrayList<>();
    }
  graph[0].add(new Edge(0,1,1));
  graph[0].add(new Edge(0,2,1));

  graph[1].add(new Edge(1,0,1));
  graph[1].add(new Edge(1,3,1));

  graph[2].add(new Edge(2,0,1));
  graph[2].add(new Edge(2,4,1));
 
  graph[3].add(new Edge(3,1,1));
  // graph[3].add(new Edge(3,4,1));
  // graph[3].add(new Edge(3,5,1));

  graph[4].add(new Edge(4,2,1));
  // graph[4].add(new Edge(4,3,1));
  graph[4].add(new Edge(4,5,1));

  // graph[5].add(new Edge(5,3,1));
  graph[5].add(new Edge(5,4,1));
  graph[5].add(new Edge(5,6,1));

  graph[6].add(new Edge(6,5,1));

  graph[7].add(new Edge(7,8,1));
  graph[8].add(new Edge(8,7,1));
}


public static void DFS(ArrayList<Edge> graph[]) {
  boolean vis[]=new boolean[graph.length];
  for (int i=0;i<graph.length;i++) {
    if (!vis[i]) {
      DFSutil(graph,i,vis);
    }
  }
}
public static void DFSutil(ArrayList<Edge> graph[],int curr,boolean vis[]) { // O(V+E) no. of vertex and edges
  System.out.print(curr+" ");
    vis[curr]=true;
    for (int i=0;i<graph[curr].size();i++) {
      Edge e=graph[curr].get(i);
      if (!vis[e.dest]) {
      DFSutil(graph,e.dest,vis);
    }
  }
  return;
 
}

public static boolean find(ArrayList<Edge> graph[]) {
  boolean vis[]=new boolean[graph.length];
  for (int i=0;i<graph.length;i++) {
    if (!vis[i]) {
      if(findutil(graph,vis,i,-1)) {
        return true;
      }
    }
  }
  return false;
}
public static boolean findutil(ArrayList<Edge> graph[],boolean vis[],int curr,int par) { 
    vis[curr]=true;
    for (int i=0;i<graph[curr].size();i++) {
      Edge e=graph[curr].get(i);

      // case 3
      if (!vis[e.dest]) {
        if (findutil(graph,vis,e.dest,curr)) {
          return true;
        }
    }
    // case 1
    else if (vis[e.dest] && e.dest!=par) {
      return true;
    }
    // case 2 -> do nothing -> continue
  }
  return false;
 
}
  public static void main(String args[]) {
    /* 
        
       1-----3
      /      | \
     /       |  \
    0        |   \
     \       |    5-----6
      \      |   /
       2-----4--/
*/
  int V=9;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  System.out.print("The DFS traversal is:");
  DFS(graph);
  System.out.println();
  boolean b=find(graph);
  System.out.println("There is a cycle in the given graph:"+b);
} 

}
