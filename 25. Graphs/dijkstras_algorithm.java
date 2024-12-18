/* Write a code to find shortest path from source to all vertices in a weighted graph using
 dijkstra's algorithm
 */
// TC O(V+ElogV) logv for operartions in pq
import java.util.*;
public class dijkstras_algorithm {
  static class Edge {
    int src;
    int dest;
    int wt;
    public Edge(int s, int d,int wt) {
      this.src=s;
      this.dest=d;
      this.wt=wt;
    }
  }

  static void createGraph(ArrayList<Edge> graph[]) {
    for (int i=0;i<graph.length;i++) {
      graph[i]=new ArrayList<>();
    }
  graph[0].add(new Edge(0,1,2));
  graph[0].add(new Edge(0,2,4));
  graph[1].add(new Edge(1,3,7));
  graph[1].add(new Edge(1,2,1));
  graph[2].add(new Edge(2,4,3));
  graph[4].add(new Edge(4,3,2));
  graph[4].add(new Edge(4,5,5));
  graph[3].add(new Edge(3,5,1));
  }
  static class Pair implements Comparable<Pair>{
    int n; // node
    int path;
    public Pair(int n,int path) {
      this.n=n;
      this.path=path;
    }

    @Override
    public int compareTo (Pair p2) {
      return this.path-p2.path; // path based sorting for my pairs
    } 
  }
  public static void dijkstra(ArrayList<Edge> graph[],int src) {
    int distance[]=new int[graph.length]; // dist[i] -> distance from source to i
    for (int i=0;i<graph.length;i++) {
      if (i!=src) {
        distance[i]=Integer.MAX_VALUE; // infinity
      }
    }
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    boolean vis[]=new boolean[graph.length];
    pq.add(new Pair(src,0));
    while (!pq.isEmpty()) {
      Pair curr=pq.remove();
      vis[curr.n]=true;
      for (int i=0;i<graph[curr.n].size();i++) {
        Edge e=graph[curr.n].get(i);
        if (!vis[e.dest]) {
          int u=e.src;
          int v=e.dest;
          int wt=e.wt;
          if (distance[u]+wt<distance[v]) {
             distance[v]=distance[u]+wt;
          }
          pq.add(new Pair(v,distance[v]));
        }
      }
    }
    for (int i=0;i<distance.length;i++) {
      System.out.print(" "+distance[i]);
    }
  }
  public static void main(String args[]) {
  int V=6;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  int src=0;
  System.out.print("The shortest path from source to all vertices are:");
  dijkstra(graph,src);
  System.out.println();
  
} 

}


