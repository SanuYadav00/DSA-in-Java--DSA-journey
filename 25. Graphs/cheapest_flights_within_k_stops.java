/* There are n cities connected by some number of flights. You are given an array flights where
 flights[i]=[from,to,price] indicates that there is a flight.
 You are also given three integers src, dst and k, return the cheapest price from src to dst with at 
 most k stops. If there is no such route, return -1.
 All values are positive.
 input: flights=[[0,1,100],[1,2,100],[0,2,500]]
 src=0,dst=2,k=1
 ans=200
 */
import java.util.*;
public class cheapest_flights_within_k_stops {
  static class Edge {
    int src;
    int dest;
    int wt;
    public Edge (int s, int d, int w) {
      this.src=s;
      this.dest=d;
      this.wt=w;
    }
  }

  public static void createGraph(int flights[][],ArrayList<Edge> graph[]) {
     for (int i=0;i<graph.length;i++) {
      graph[i]=new ArrayList<>();
     }
     for (int i=0;i<graph.length;i++) {
      int src=flights[i][0];
      int dest=flights[i][1];
      int wt=flights[i][2];
      Edge e=new Edge(src,dest,wt);
      graph[src].add(e);
     }
  }

  public static class Info {
    int V;
    int cost;
    int stops;
    
    public Info(int v,int c, int s) {
      this.V=v;
      this.cost=c;
      this.stops=s;
    }

  }

  public static int cheapestFlights(int n, int flights[][],int src,int dest,int k) {
    ArrayList<Edge> graph[]=new ArrayList[n];
    createGraph(flights,graph);
    int distance[]=new int[n];
    for (int i=0;i<n;i++) {
      if (i!=src) {
        distance[i]=Integer.MAX_VALUE;
      }
    }
    Queue<Info> q=new LinkedList<>();
    q.add(new Info (0,0,0));

    while (!q.isEmpty()) {
        Info curr=q.remove();
        if (curr.stops>k) {
          break;
        }
        for (int i=0;i<graph[curr.V].size();i++) {
           Edge e=graph[curr.V].get(i);
           int u=e.src;
           int v=e.dest;
           int wt=e.wt;

           if (curr.cost+wt<distance[v] && curr.stops<=k) {
            distance[v]=curr.cost+wt;
            q.add(new Info(v,distance[v],curr.stops+1));
           }
        }
    }
    if (distance[dest]==Integer.MAX_VALUE) {
      return -1;
    }
    else {
      return distance[dest];
    }
  }
  public static void main(String args[]) {
    int n=4;
    int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
    int src=0, dst=3, k=1;
    int a=cheapestFlights(n,flights,src,dst,k);
    System.out.println("The cheapest price from src to dst with at most "+ k+" stops is:"+a);
  }
}
