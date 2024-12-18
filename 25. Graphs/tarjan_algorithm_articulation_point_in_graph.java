/* Write a program to find a bridge in an undirected graph using tarjan's algorithm */
// TC O(V+E)
import java.util.*;
public class tarjan_algorithm_articulation_point_in_graph {
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
  graph[0].add(new Edge(0,3));

  graph[1].add(new Edge(1,0));
  graph[1].add(new Edge(1,2));

  graph[2].add(new Edge(2,0));
  graph[2].add(new Edge(2,1));

  graph[3].add(new Edge(3,0));
  graph[3].add(new Edge(3,4));
  //graph[3].add(new Edge(3,5));

  graph[4].add(new Edge(4,3));
  // graph[4].add(new Edge(4,5));

  // graph[5].add(new Edge(5,3));
  // graph[5].add(new Edge(5,4));
  }

  public static void getAP(ArrayList<Edge> graph[],int V) {
    int dt[]=new int[V]; // discover time array
    int low[]=new int[V]; // lowest discover time of neighbours
    int time=0;
    boolean vis[]=new boolean[V];
    boolean ap[]=new boolean[V]; // to prevent same ap from getting printed multiple times
    for (int i=0;i<V;i++) {
      if (!vis[i]) {
        DFS(graph,i,-1,dt,low,vis,time,ap);
      }
    }

    // print all APs
    for (int i=0;i<V;i++) {
      if (ap[i]) {
       System.out.println("Articulation Point:"+i);
      }
    }
}
 
  // O(V+E)
  public static void DFS(ArrayList<Edge> graph[], int curr,int par,
   int dt[],int low[],boolean vis[],int time,boolean ap[]) {
      vis[curr]=true;
      dt[curr]=low[curr]=++time;
      int children=0;
      for (int i=0;i<graph[curr].size();i++) {
        Edge e=graph[curr].get(i);
        int neigh=e.dest;

        // condition 1
        if (neigh==par) {
          continue;
        }

        // condition 2
        else if (vis[neigh]) {
          low[curr]=Math.min(low[curr],dt[neigh]);
        }

        // condition 3
        else {
          DFS(graph,neigh,curr,dt,low,vis,time,ap);
          low[curr]=Math.min(low[curr],low[neigh]);
          if (par!=-1 && dt[curr]<=low[neigh]) {
            // System.out.println("Articulation Point:"+curr);
          ap[curr]=true;
          }
          children++;
        }
        if (par==-1 && children>1) {
          // System.out.println("Articulation Point:"+curr);
          ap[curr]=true;
        }
      }
    
  }
  public static void main(String args[]) {
    int V=6;
    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    getAP(graph,V);
    
    
  } 
  
}

