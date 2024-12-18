/* write a program to perform bfs and dfs in a disconnected graph */
import java.util.*;
public class disconnected_graph_traversal {
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
  graph[3].add(new Edge(3,4,1));
  graph[3].add(new Edge(3,5,1));

  graph[4].add(new Edge(4,2,1));
  graph[4].add(new Edge(4,3,1));
  graph[4].add(new Edge(4,5,1));

  graph[5].add(new Edge(5,3,1));
  graph[5].add(new Edge(5,4,1));
  graph[5].add(new Edge(5,6,1));

  graph[6].add(new Edge(6,5,1));

  graph[7].add(new Edge(7,8,1));
  graph[8].add(new Edge(8,7,1));
}

public static void BFS(ArrayList<Edge> graph[]) {
  boolean vis[]=new boolean[graph.length];
  for (int i=0;i<graph.length;i++) {
    if (!vis[i]) {
      BFSutil(graph,vis,i);
    }
  }
}
public static void BFSutil(ArrayList<Edge> graph[],boolean vis[],int idx) { // O(V+E) no. of vertex and edges
  Queue<Integer> q=new LinkedList<>();
  q.add(idx); // source
  while (!q.isEmpty()) {
    int curr=q.remove();
    if (!vis[curr]) {
      System.out.print(curr+" ");
      vis[curr]=true;
      for (int i=0;i<graph[curr].size();i++) {
        Edge e=graph[curr].get(i);
        q.add(e.dest);
      }
    }
  }
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
  System.out.print("The BFS traversal is:");
  BFS(graph);
  System.out.println();
  System.out.print("The DFS traversal is:");
  DFS(graph);
} 

}
