/* find the minimum cost to join all edges using Kruskal's algorithm */
// TC O(v+ElogE) v is for loop and eloge is for sorting of edges
// operations under the loop will take constant time as disjoint set ds are highly optimized

import java.util.*;
public class kruskal_algorithm {
  static class Edge implements Comparable<Edge> {
    int src;
    int dest;
    int wt;
    public Edge(int s,int d, int w) {
      this.src=s;
      this.dest=d;
      this.wt=w;
    }

    @Override
    public int compareTo(Edge e2) {
         return this.wt-e2.wt;
    }
  }
  static void createGraph(ArrayList<Edge> edges) {
    //edges
    edges.add(new Edge(0,1,10));
    edges.add(new Edge(0,2,15));
    edges.add(new Edge(0,3,30));
    edges.add(new Edge(1,3,40));
    edges.add(new Edge(2,3,50));
  }
  static int n=4; // no. of vertices 
  static int par[]=new int[n];
  static int rank[]=new int[n];

  public static void init() {
    for (int i=0;i<n;i++) {
      par[i]=i;
    }
  }

  public static int find(int x) {
    if (x==par[x]) {
      return x;
    }
    return par[x]=find(par[x]);
  }

  public static void union (int a, int b) { //O(4k)=O(1)
     int parA=find(a);
     int parB=find(b);

     if (rank[parA]==rank[parB]) {
      par[parB]=parA;
      rank[parA]++;
     }
     else if (rank[parA]>rank[parB]) {
      par[parB]=parA;
     }
     else {
      par[parA]=parB;
     }
 }

  public static void KruskalsMST(ArrayList<Edge> edges,int V) {
    init();
    Collections.sort(edges);
    int mstCost=0;
    int count=0;
    for (int i=0;count<V-1;i++) {
      Edge e=edges.get(i);

      int parA=find(e.src); // src=a
      int parB=find(e.dest); // dest=b
      if (parA!=parB) {
         union(e.src,e.dest);
         mstCost+=e.wt;
         count++;
      }
    }

    System.out.println("The minimum cost to join all edges is:"+mstCost);

  }
  public static void main(String args[]) {
    int V=4;
    ArrayList<Edge> edges=new ArrayList<>();
    createGraph(edges);
    KruskalsMST(edges,V);
  }
  
}
