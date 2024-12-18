/* For a given source and detination, tell if a path exists from source to destination */
import java.util.*;
public class has_path {
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

}

public static boolean exists(ArrayList<Edge> graph[],int s,int d,boolean vis[]) {
  // TC O(V+E)
  if (s==d) {
    return true;
  }
  vis[s]=true;
  for (int i=0;i<graph[s].size();i++) {
    Edge e=graph[s].get(i);
    if(!vis[e.dest] && exists(graph,e.dest,d,vis)) { // e.dest is neighbour
      return true;
    }
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
 Scanner sc=new Scanner(System.in);
  int V=7;
  ArrayList<Edge> graph[]=new ArrayList[V];
  createGraph(graph);
  System.out.print("Enter source:");
  int s=sc.nextInt();
  System.out.print("Enter destination:");
  int d=sc.nextInt();
  boolean vis[]=new boolean[graph.length];
  boolean b=exists(graph,s,d,vis);
  System.out.println("There exists a path between "+s+" and "+d+" in the given graph:"+b);
  sc.close();
} 

}

