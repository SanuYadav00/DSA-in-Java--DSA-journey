/* Find the minimum cost for connecting all cities on the map
 cities[][]={{0,1,2,3,4}
             {1,0,5,0,7}
             {2,5,0,6,0}
             {3,0,6,0,0}
             {4,7,0,0,0}
             }
  ans=10           
 */
// We will be using prims algorithm
import java.util.*;
public class connecting_cities_with_minimum_cost {
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

  static class Pair implements Comparable<Pair> {
    int v; // vertex
    int cost;
    public Pair(int v,int c) {
      this.v=v;
      this.cost=c;
    }

    @Override
    public int compareTo(Pair p2) {
      return this.cost-p2.cost;//ascending
    }

  }

  static void createGraph(ArrayList<Edge> graph[],int arr[][]) {
    for (int i=0;i<graph.length;i++) {
      graph[i]=new ArrayList<>();
    }
    for (int i=0;i<arr.length;i++) {
      for (int j=0;j<arr.length;j++) {
        if (arr[i][j]!=0) {
        graph[i].add(new Edge(i,j,arr[i][j]));
      }
    }
  }
}
  public static int minimum_cost(ArrayList<Edge> graph[]) {
    boolean vis[]=new boolean[graph.length];
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    int min_cost=0;
    pq.add(new Pair(0,0));
    while (!pq.isEmpty()) {
      Pair curr=pq.remove();
      if (!vis[curr.v]) {
        vis[curr.v]=true;
        min_cost+=curr.cost;
        for (int i=0;i<graph[curr.v].size();i++) {
          Edge e=graph[curr.v].get(i);
          pq.add(new Pair(e.dest,e.wt));
        }
      }
    }

    return min_cost;
    }

  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no. of cities:");
  int n=sc.nextInt();
  int arr[][]=new int[n][n];
  for (int i=0;i<n;i++) {
    System.out.print("Enter the cost to travel to all cities from city "+(i+1)+":");
    for (int j=0;j<n;j++) {
      arr[i][j]=sc.nextInt();
    }
  }
  ArrayList<Edge> graph[]=new ArrayList[n];
  createGraph(graph,arr);
  int c=minimum_cost(graph);
  System.out.println("The minimum cost to connect all cities is:"+c);
  
} 

}
