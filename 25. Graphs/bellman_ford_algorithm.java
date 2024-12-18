/* Write a code to find shortest path from source to all vertices in a negative weighted graph using
 bellman ford algorithm
 */
// borh methods have TC  O(V*E)
// import java.util.*;
// public class bellman_ford_algorithm{
//   static class Edge {
//     int src;
//     int dest;
//     int wt;
//     public Edge(int s, int d,int wt) {
//       this.src=s;
//       this.dest=d;
//       this.wt=wt;
//     }
//   }

//   static void createGraph(ArrayList<Edge> graph[]) {
//     for (int i=0;i<graph.length;i++) {
//       graph[i]=new ArrayList<>();
//     }
//   graph[0].add(new Edge(0,1,2));
//   graph[0].add(new Edge(0,2,4));
//   graph[1].add(new Edge(1,2,-4));
//   graph[2].add(new Edge(2,3,2));
//   graph[3].add(new Edge(3,4,4));
//   graph[4].add(new Edge(4,1,-1));
//   }
//   public static void bellman(ArrayList<Edge> graph[],int src) {
//     int distance[]=new int[graph.length];
//     for (int i=0;i<graph.length;i++) {
//       if(i!=src) {
//         distance[i]=Integer.MAX_VALUE;
//       }
//     }
//     int V=graph.length;
//    for (int i=0;i<V-1;i++) {
//      for (int j=0;j<graph.length;j++) {
//       for (int k=0;k<graph[j].size();k++) {
//         Edge e=graph[j].get(k);
//         int u=e.src;
//         int v=e.dest;
//         int wt=e.wt;
//         if (distance[u]!=Integer.MAX_VALUE && wt+distance[u]<distance[v]) {
//             distance[v]=wt+distance[u];
//         }
//       }
//      }
//    }
//    for (int i=0;i<distance.length;i++) {
//     System.out.print(" "+distance[i]);
//   }
//   }
//   public static void main(String args[]) {
//   int V=5;
//   ArrayList<Edge> graph[]=new ArrayList[V];
//   createGraph(graph);
//   int src=0;
//   System.out.print("The shortest path from source to all vertices are:");
//   bellman(graph,src);
//   System.out.println();
  
// } 

// }

import java.util.*;
public class bellman_ford_algorithm{
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

  static void createGraph(ArrayList<Edge> graph) {
  graph.add(new Edge(0,1,2));
  graph.add(new Edge(0,2,4));
  graph.add(new Edge(1,2,-4));
  graph.add(new Edge(2,3,2));
  graph.add(new Edge(3,4,4));
  graph.add(new Edge(4,1,-1));
  }
  public static void bellman(ArrayList<Edge> graph,int src,int V) {
    int distance[]=new int[V];
    for (int i=0;i<V;i++) {
      if(i!=src) {
        distance[i]=Integer.MAX_VALUE;
      }
    }
   for (int i=0;i<V-1;i++) {
      for (int k=0;k<graph.size();k++) {
        Edge e=graph.get(k);
        int u=e.src;
        int v=e.dest;
        int wt=e.wt;
        if (distance[u]!=Integer.MAX_VALUE && wt+distance[u]<distance[v]) {
            distance[v]=wt+distance[u];
        }
      }
     }
   
   for (int i=0;i<distance.length;i++) {
    System.out.print(" "+distance[i]);
  }
  }
  public static void main(String args[]) {
  int V=5;
  ArrayList<Edge> graph=new ArrayList<>();
  createGraph(graph);
  int src=0;
  System.out.print("The shortest path from source to all vertices are:");
  bellman(graph,src,V);
  System.out.println();
  
} 

}



