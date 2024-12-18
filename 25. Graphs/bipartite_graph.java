/* write a program to check if the given graph is bipartite or not */
// O(V+E) no. of vertex and edges
// SC O(V)
import java.util.*;
public class bipartite_graph {
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
  graph[0].add(new Edge(0,1));
  graph[0].add(new Edge(0,2));
  graph[1].add(new Edge(1,0));
  graph[1].add(new Edge(1,3));
  graph[2].add(new Edge(2,0));
  graph[2].add(new Edge(2,4));
  graph[3].add(new Edge(3,1));
  graph[3].add(new Edge(3,4));
  graph[4].add(new Edge(4,2));
  graph[4].add(new Edge(4,3));
  
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

public static boolean find(ArrayList<Edge> graph[]) {
  int col[]=new int[graph.length];
  for (int i=0;i<col.length;i++) {
    col[i]=-1; // no color
   
  }
  Queue<Integer> q=new LinkedList<>();
  for (int i=0;i<graph.length;i++) {
    if (col[i]==-1) {
      q.add(i);
      col[i]=0; // yellow
      while(!q.isEmpty()) {
         int curr=q.remove();
        
         for (int j=0;j<graph[curr].size();j++) {
          Edge e=graph[curr].get(j);
          if (col[e.dest]==-1) {
            int nextCol=col[curr]==0 ? 1:0;
            col[e.dest]=nextCol;
            q.add(e.dest);
          }
          else if(col[e.dest]==col[curr]) {
             return false; // Not-bipartite
          }
        }
        
      }
      
    }
    
  }
  
  return true;

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
  int V=5;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  System.out.print("The BFS traversal is:");
  BFS(graph);
  boolean b=find(graph);
  System.out.println("The graph is bipartite:"+b);
  
} 

}
