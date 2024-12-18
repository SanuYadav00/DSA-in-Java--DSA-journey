/* We are given a bar of chocolate composed of m*n square pieces. One should break the
 chocolate into single squares. Each break of a part of the chocolate is charged
 a cost expressed by a positive integer. This cost does not depend on the size of
  the part that is being broken but only depends on the line the break goes along.
  Let us denote the costs of breaking along consecutive vertical lines with x1,x2,.
  ....,xm-1 and along horizontal lines with y1,y2,....,yn-1. 
  Compute the minimal cost of breaking the whole chocolate into single squares.
  sample input: n=4, m=6 cost of respective vertical cuts=2,1,3,1,4 
  cost of respective horizontal cuts=4,1,2
  Sample output: Minimum cost=42 
  */
  // Time complexity O(nlogn)
import java.util.*;  
public class chocola_problem {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter total no. of pieces in one column:");
    int n=sc.nextInt();
    System.out.print("Enter total no. of pieces in one row:");
    int m=sc.nextInt();
    Integer costVer[]=new Integer[m-1];
    System.out.print("Enter costs for respective vertical cuts:");
    for (int i=0;i<(m-1);i++) {
      costVer[i]=sc.nextInt();
    }
    Integer costHor[]=new Integer[n-1];
    System.out.print("Enter costs for respective horizontal cuts:");
    for (int i=0;i<(n-1);i++) {
      costHor[i]=sc.nextInt();
    }
    Arrays.sort(costVer,Collections.reverseOrder());
    Arrays.sort(costHor,Collections.reverseOrder());

    int h=0,v=0; // no. of horizontal and vertical cuts
    int hp=1,vp=1; // no. of horizontal pieces and vertical pieces
    int cost=0;

    while (h<costHor.length && v<costVer.length) {
      // vertical cost < horizontal cost
      if (costVer[v]<=costHor[h]) { // horizontal cut
           cost+= (costHor[h] * vp);
           hp++;
           h++;
      }
      else { // vertical cut
        cost+=(costVer[v]*hp);
        vp++;
        v++;
      }
    }
    while (h < costHor.length) {
      cost+=(costHor[h]*vp);
      hp++;
      h++;
    }

    while (v<costVer.length) {
      cost+=(costVer[v]*hp);
      vp++;
      v++;
    }
    System.out.println("The minimal cost is:"+cost);
    sc.close();
  }
  
}
